import java.util.Scanner;

public class Piyango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int piyangoSayisi = (int)(Math.random()*90)+10;

        System.out.println("piyango için bir sayı giriniz ( iki basamaklı olsun)");
        int tahmin = input.nextInt();

        int piyangoBirler = piyangoSayisi % 10;
        int piyangoOnlar = piyangoSayisi / 10;
        int tahminBirler = tahmin % 10;
        int tahminOnlar = tahmin / 10;

        if (piyangoSayisi == tahmin) {

            System.out.println(" Tebrikler bildiniz 10 bin tl kazandınız");
            System.out.println(" piyango sayısı : " + piyangoSayisi);

        }else if (piyangoBirler == tahminOnlar && piyangoOnlar == tahminBirler) {

            System.out.println("tebrikler iki rakamı da bildiniz 3000 tl kazandınız");
            System.out.println(" piyango sayısı : " + piyangoSayisi);
        }else if (piyangoBirler == tahminOnlar || piyangoOnlar == tahminBirler || piyangoBirler == tahminBirler || piyangoOnlar == tahminOnlar) {

            System.out.println("tebrikler bir rakamı bildiniz 1000 tl kazandınız");
            System.out.println(" piyango sayısı : " + piyangoSayisi);
        }else {
            System.out.println(" bir şey bilemediniz ve kazanamadınız");
            System.out.println(" piyango sayısı : " + piyangoSayisi);
        }

    }
}
