package cp07Questions;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = new int[10];
        System.out.println("10 adet sayı giriniz.");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = input.nextInt();
        }

        bubbleSort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

    }

    public static void bubbleSort(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {

                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;

                }
            }
        }


    }
}