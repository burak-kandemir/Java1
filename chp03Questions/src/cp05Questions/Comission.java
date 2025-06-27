package cp05Questions;

import java.util.Scanner;

public class Comission {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
double hedefKomisyon = 30000;
        double toplamKomisyon = 0;
       double toplamSatis = 0;
        while (toplamKomisyon<hedefKomisyon){

            System.out.println("komisyonunuzu öğrenmek için satış yaptığınız miktarı giriniz");
            double satis = input.nextDouble();
            double komisyon = 0;
            if (satis<5000){
                komisyon += satis*0.08;


            }else if (satis<10000){
               komisyon += 5000*0.08 + (satis-5000)*0.10;

            }else
                komisyon += 5000*0.08 + (5000*0.10 + (satis-10000)*0.12);


        toplamKomisyon += komisyon;
        toplamSatis += satis;
        System.out.printf("Bu satıştan kazandığınız komisyon: %.2f TL%n", komisyon);
        System.out.printf("Toplam komisyonunuz: %.2f TL%n", toplamKomisyon);
        System.out.printf("Toplam satış miktarınız: %.2f TL%n%n", toplamSatis);

            if (toplamKomisyon < hedefKomisyon) {
                double kalanKomisyon = hedefKomisyon - toplamKomisyon;
                double gerekliSatis = 0;


                if (toplamSatis < 5000) {

                    gerekliSatis = kalanKomisyon / 0.08;
                } else if (toplamSatis < 10000) {

                    gerekliSatis = kalanKomisyon / 0.10;
                } else {

                    gerekliSatis = kalanKomisyon / 0.12;
                }

                System.out.printf("Hedefe ulaşmak için yaklaşık %.2f TL'lik daha satış yapmanız gerekiyor.%n%n", gerekliSatis);
            }

        }
        System.out.println("yıllık hedefiniz olan 30.000 tl komisyona " + toplamSatis + " tl'lik ürün satarak ulaştınız.");
}
}

