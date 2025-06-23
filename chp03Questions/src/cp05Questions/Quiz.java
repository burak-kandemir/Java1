package cp05Questions;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

     long baslangic = System.currentTimeMillis();
        int sayac = 0;

        for (int i = 0; i <= 10; i++) {

            int sayi1 = (int) (Math.random() * 15);
            int sayi2 = (int) (Math.random() * 15);
            System.out.println( sayi1 + " - " + sayi2 + " ? ");
            int cevap = input.nextInt();
            if (cevap == (sayi1-sayi2)) {
                sayac++;
            }

        }
        long bitis = System.currentTimeMillis();
        long sure = bitis - baslangic;
        System.out.println(sayac + " işleminiz doğru.");
        System.out.println("test süreniz : " + sure );
    }
  }
