import java.util.Scanner;

public class paraHesabı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("elinizde olan para miktarını giriniz");
        double Para = input.nextDouble();
        int toplamKurus = (int) (Para * 100);
        System.out.println("paranız toplam " + toplamKurus + " kurustur. ");

        int toplamTl =  toplamKurus / 100;
        System.out.println("toplam tl miktarı : " +  toplamTl);

        int kalanKurus = toplamKurus % 100;
       int elliKurus = kalanKurus / 50;
       System.out.println("50 kurus miktarı : " + elliKurus);
       kalanKurus %=  50;
       int yirmiBesKurus = kalanKurus / 25;
       System.out.println("25 kuruş miktarı : " +  yirmiBesKurus);

       kalanKurus %=  25;

        int onKurus = kalanKurus / 10 ;
        System.out.println("10 kuruş miktarı: " +   kalanKurus );
        kalanKurus %=  10;
        int besKurus = kalanKurus / 5;
        System.out.println(" 5 kurus miktarı " + besKurus);

        kalanKurus %=  5;

        int kurusMiktar = kalanKurus ;
        System.out.println("kurus miktar: " + kurusMiktar);



    }
}
