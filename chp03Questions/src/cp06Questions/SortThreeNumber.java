package cp06Questions;

import cp05Questions.MaxNumbers;

import java.util.Scanner;

public class SortThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıralanmasını istediğiniz 3 sayıyı giriniz");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        display(number1,number2,number3);

    }

    public static void display(double num1, double num2, double num3) {
       double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Sıralama: " + num1 + " " + num2 + " " + num3);
    }
}
