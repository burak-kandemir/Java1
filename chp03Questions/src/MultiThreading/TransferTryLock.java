package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TransferTryLock {
    static class BankaHesap {
        final String id;
        int bakiye;
        final ReentrantLock lock = new ReentrantLock();
        BankaHesap(String id, int bakiye) { this.id = id; this.bakiye = bakiye; }
        void paraYatir(int miktar) { bakiye += miktar; }
        void paraCek(int miktar) { if (bakiye < miktar) throw new IllegalStateException(id + " yetersiz!"); bakiye -= miktar; }
    }

    static void transferTryLock(BankaHesap from, BankaHesap to, int miktar) {
        while (true) {
            boolean gotFirst  = false;
            boolean gotSecond = false;
            try {
                gotFirst = from.lock.tryLock(100, TimeUnit.MILLISECONDS);
                if (!gotFirst) { backoff(); continue; }


                try { Thread.sleep(50); } catch (InterruptedException ignored) {}

                gotSecond = to.lock.tryLock(100, TimeUnit.MILLISECONDS);
                if (!gotSecond) { backoff(); continue; }


                from.paraCek(miktar);
                to.paraYatir(miktar);
                return;

            } catch (InterruptedException ignored) {
            } finally {
                if (gotSecond) to.lock.unlock();
                if (gotFirst)  from.lock.unlock();
            }
        }
    }

    static void backoff() {
        try { Thread.sleep(10 + (long)(Math.random() * 40)); } catch (InterruptedException ignored) {}
    }

    public static void main(String[] args) throws InterruptedException {
        BankaHesap a = new BankaHesap("A", 12000);
        BankaHesap b = new BankaHesap("B", 8000);

        Thread t1 = new Thread(() -> transferTryLock(a, b, 1000), "T1");
        Thread t2 = new Thread(() -> transferTryLock(b, a, 500),  "T2");

        t1.start(); t2.start();
        t1.join();  t2.join();

        System.out.println("Toplam bakiye: " + (a.bakiye + b.bakiye)); // 20000
        System.out.println("A=" + a.bakiye + " B=" + b.bakiye);
    }
}

