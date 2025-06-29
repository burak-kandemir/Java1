package cp05Questions;

import java.util.Scanner;

public class OrtalamaStandartSapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ortalaması alınacak ve standart sapması hesaplanacak sayıları giriniz.");
        double ortalama = 0;
        double standartSapma = 0;
        double standartSapma2 = 0;
        double toplam = 0;
        int sayac = 0;
        while (true) {
            double sayilar = input.nextDouble();
            if (sayilar == 0) {
                break;

            }
            toplam += sayilar;
            standartSapma2 += Math.pow(sayilar, 2);
            sayac++;
            ortalama = toplam / sayac;

            } standartSapma = Math.sqrt((standartSapma2 - (Math.pow(toplam, 2) / sayac)) / (sayac - 1));

                System.out.println("girdiğiniz sayıların ortalaması : " + ortalama + " \ngirdiğiniz sayıların standart sapması : " + standartSapma);
            }

        }


