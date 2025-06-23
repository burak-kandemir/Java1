package cp05Questions;

import java.util.Scanner;

public class highestDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ebobunu öğrenmek istediğiniz iki sayıyı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int gecici;
        if(sayi1<sayi2) {
            gecici = sayi2;
            sayi2 = sayi1;
            sayi1 = gecici;

        }
        int ebob =1;
        for (int i =1; i<=sayi2; i++) {
            if (sayi1%i==0 && sayi2%i==0) {
              ebob =i;

            }

        }
        System.out.println("iki sayının ebobu : " + ebob);


    }
}
