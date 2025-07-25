package cp07Questions;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sayilar = new int[10];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = in.nextInt();

        }
        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                System.out.println(sayilar[i] + "ve" + sayilar[j]);
            }
        }
        in.close();
    }
}
