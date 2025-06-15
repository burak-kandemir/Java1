import java.util.Scanner;

public class FaizHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yıllık faiz oranını giriniz");
        double yillikFaiz = input.nextDouble();
        System.out.println("kaç yılda ödemek istiyorsunuz");
        int sayi = input.nextInt();

        System.out.println("borç alınacak miktar:");
        double borcMiktari = input.nextDouble();

        double aylikFaiz = yillikFaiz/1200;
        double aylikOdeme = (borcMiktari*aylikFaiz) / (1- 1 / Math.pow(1+ aylikFaiz, sayi*12));
        double toplamBorc = aylikOdeme * 12 * sayi;

        System.out.println("aylik ödeme miktarı: " +(int) (aylikOdeme * 100) / 100.0);
        System.out.println("toplam ödenecek miktar:"  + (int)(toplamBorc * 100) / 100.0);


    }

}
