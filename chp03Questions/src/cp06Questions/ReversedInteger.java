package cp06Questions;

import java.util.Scanner;

public class ReversedInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Girdiğiniz sayının tersi : " + reverse(number));
    }

    public static int reverse(int number) {
        int ters = 0;
        while (number > 0) {
            int basamak = number % 10;
            ters = ters * 10 + basamak;
            number = number / 10;
        }
        return ters;
    }
}