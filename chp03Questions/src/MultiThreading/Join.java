package MultiThreading;

public class Join {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        for (int i = 0; i <= 5; i++) {
            try {
                t1.sleep(500);
            } catch (InterruptedException ex) {

            }

            System.out.println("main başladı");
            t1.start();
        }

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main çalışması bitti");
    }

}
