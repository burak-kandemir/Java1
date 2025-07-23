package cp07Questions;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("10 tane sayı giriniz. ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
        Reverse(numbers);


        System.out.println("Dizinin tersi");
        for (int e : numbers) {
            System.out.print(e + " ");
        }
        input.close();

    }

    public static void Reverse(int[] list) {
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

    }

}