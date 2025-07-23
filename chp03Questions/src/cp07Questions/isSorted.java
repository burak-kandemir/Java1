package cp07Questions;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = new int[10];
        System.out.println("10 adet sayı giriniz.");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = input.nextInt();
        }
        if (IsSorted(dizi)) {
            System.out.println("dizi sıralıdır");

        } else {
            System.out.println("dizi sıralı değildir");
        }
    }


    public static boolean IsSorted(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] > dizi[i + 1]) {
                return false;
            }
        }
        return true;
    }
}