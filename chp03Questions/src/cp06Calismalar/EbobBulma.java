package cp06Calismalar;

import java.util.Scanner;

public class EbobBulma {

    public static int ebobBulma(int a, int b) {

        int ebob = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayı");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayı");
        int sayi2 = scan.nextInt();

        System.out.println("iki sayının ebobu : " + ebobBulma(sayi1, sayi2));
    }
}
