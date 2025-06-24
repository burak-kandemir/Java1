package cp05Questions;

import java.util.Scanner;

public class PatternC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <= sayi-i; j++) {
                System.out.print( "  ");

            }for (int j= i  ; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
