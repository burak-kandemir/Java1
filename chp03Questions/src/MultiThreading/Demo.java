package MultiThreading;

   class NumberTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    class LetterTask implements Runnable {
        public void run() {
            for (int i = 'A'; i <= 'E'; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
    public class Demo {
        public static void main(String[] args) {
        Thread t1 = new Thread(new NumberTask(), "Numbers- thread");
        Thread t2 = new Thread(new LetterTask(), "Letters - Thread");
        System.out.println("👉 RUN ile çalıştırma (tek thread, sırayla):");
        t1.run();
        t2.run();

        System.out.println("\n👉 START ile çalıştırma (multi-thread, karışık sıra olabilir):");
        t1.start();
        t2.start();
    }
}