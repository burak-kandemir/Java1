package cp05Questions;

import java.util.Scanner;

public class PatternD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int rakam = input.nextInt();

        for (int i = 0; i < rakam; i++) {
            for (int j =0 ; j < i; j++) {
                System.out.print("  ");

            }for (int j = 1; j <= rakam-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
