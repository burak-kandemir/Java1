package MultiThreading;

public class SleepEx {

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    try {
                        Thread.sleep(1000);
                        if ( i==3){
                            Thread.sleep(2000);
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }, "Numbers-Thread");

            t1.start();
        }
    }

