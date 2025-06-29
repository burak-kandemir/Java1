package cp05Questions;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int sayac = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i + " " + j);
                sayac++;

            }

        }
        System.out.println("kombinasyonda olan sayıların sayısı : " + sayac);
    }
}
