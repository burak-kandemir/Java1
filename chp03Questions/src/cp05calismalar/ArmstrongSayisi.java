package cp05calismalar;

import java.util.Scanner;

public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz ve armstrong sayısı olup olmadığını öğrenin.");
        int sayi = input.nextInt();

        int gerceksayi = sayi;
        int basamaksayisi = String.valueOf(sayi).length();
        int toplam = 0;

        while (sayi > 0) {

            int basamak = sayi % 10;
            toplam += Math.pow(basamak, basamaksayisi);
            sayi = sayi/10;
        }if (gerceksayi == toplam) {
            System.out.println("bu bir armstrong sayisi");

        }else {
            System.out.println("bu bir armstrong sayisi değil");
        }
    }
}