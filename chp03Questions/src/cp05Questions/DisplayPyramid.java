package cp05Questions;

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("piramitoluşturmak için '1-15' arası bir sayı giriniz");
        int sayi = scan.nextInt();
    for (int i = 1; i <= sayi; i++) {

        for (int j = 1 ; j <= sayi-i; j++) {
            System.out.print("  ");

        }for (int j = i ; j >= 1; j--) {
            System.out.print(j + " ");
        }

        for (int j = 2 ; j <= i; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }



    }
}
