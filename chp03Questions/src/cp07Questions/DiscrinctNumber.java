package cp07Questions;

import java.util.Scanner;

public class DiscrinctNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sayilar[] = new int[10];
        int sayi;
        int sayac = 0;


        System.out.println("10 adet sayı giriniz.");
        for (int i = 0; i < sayilar.length; i++) {
            sayi = in.nextInt();

            if (tekrar(sayilar, sayi)) {
                sayilar[sayac] = sayi;
                sayac++;
            }

        }
        System.out.println("tekrar etmeyen sayıların sayısı : " + sayac);
        System.out.println("farklı sayılar : ");
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > 0) {
                System.out.print(" " + sayilar[i]);
            }

        }
    }

    public static boolean tekrar(int[] sayilar, int sayi) {

        for (int i = 0; i < sayilar.length; i++) {
            if (sayi == sayilar[i]) {
                return false;
            }


        }
        return true;
    }

}
