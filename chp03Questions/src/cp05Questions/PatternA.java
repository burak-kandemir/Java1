package cp05Questions;

import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sağ üçgen için bir rakam giriniz");
        int sayi = scan.nextInt();

    for (int i = 1; i <= sayi; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();
    }

    }

}
