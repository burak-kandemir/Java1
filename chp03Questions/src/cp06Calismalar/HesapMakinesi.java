package cp06Calismalar;

import java.util.Scanner;

public class HesapMakinesi {
    public static int toplama(int a, int b) {
        return a + b;
    }

    public static int cıkarma(int a, int b) {
        return a - b;
    }

    public static int carpma(int a, int b) {
        return a * b;
    }

    public static double bolme(double a, double b) {
        if (b == 0) {
            System.out.println("Bir sayı sıfıra bölünemez!");
            return Double.NaN;

        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1. işlem toplama \n 2. işlem çıkartma \n 3. işlem çarpma \n 4. işlem bölme \n 5. işlem çıkış ");

            int islem = input.nextInt();

            if (islem == 1) {
                System.out.println("toplamak istediğiniz sayıları giriniz");
                int sayi1 = input.nextInt();
                int sayi2 = input.nextInt();

                System.out.println("yaptığınız işlemin sonucu : " + toplama(sayi1, sayi2));
            } else if (islem == 2) {

                System.out.println("çıkartmak istediğiniz sayıları giriniz");
                int sayi1 = input.nextInt();
                int sayi2 = input.nextInt();

                System.out.println("yaptığınız işlemin sonucu : " + cıkarma(sayi1, sayi2));
            } else if (islem == 3) {

                System.out.println("çarpmak istediğiniz sayıları giriniz");
                int sayi1 = input.nextInt();
                int sayi2 = input.nextInt();

                System.out.println("yaptığınız işlemin sonucu : " + carpma(sayi1, sayi2));

            } else if (islem == 4) {

                System.out.println("bölmek istediğiniz sayıları giriniz");
                double sayi1 = input.nextDouble();
                double sayi2 = input.nextDouble();

                System.out.println("yaptığınız işlemin sonucu : " + bolme(sayi1, sayi2));
            } else if (islem == 5) {
                System.out.println("programdan çıkılıyor...");
                break;

            }
        }
    }
}