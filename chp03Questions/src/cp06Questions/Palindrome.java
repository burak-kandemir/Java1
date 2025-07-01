package cp06Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("palindrome olduğunu kontrol etmek için bir sayi giriniz");
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println("girdiğiniz sayı bir palindrome");
        } else {
            System.out.println("girdiğiniz sayı bir palindrome değil");
        }


    }

    public static int reverse(int number) {
       int ters =0;
        while (number > 0) {
           int basamak = number%10;
            ters =ters*10+ basamak;
                    number = number/10;
        }
        return ters;


    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);

    }
}
