package Framework;

import java.util.Vector;

public class ThreadVectorExample {
    public static void main(String[] args) {

        Vector<String> notebook = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                notebook.add("T1 notu " + i);
                System.out.println("Thread 1 deftere yazdı: T1 notu " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                notebook.add("T2 notu " + i);
                System.out.println("Thread 2 deftere yazdı: T2 notu " + i);
            }
        });
        t1.start();
        t2.start();
    }
}