package cp07Questions;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("kaç öğrencinin notunu gireceksiniz?");
        int sayi = in.nextInt();

        int[] not = new int[sayi];
        char[] harfNotu = new char[not.length];

        System.out.println("öğrencilerin sınav puanlarını giriniz.");
        for (int i = 0; i <sayi; i++) {
            System.out.print("Öğrenci " + i + ": ");
            not[i] = in.nextInt();
        }
        getGrades(not, harfNotu);
        System.out.println("\nSonuçlar:");
        for (int i = 0; i < sayi; i++) {
            System.out.println("Öğrenci " + i + " notu: " + not[i] + " -> Harf Notu: " + harfNotu[i]);
        }

        in.close();
    }


    public static int max(int[] not) {
        int max = not[0];
        for (int i = 1; i < not.length; i++) {
            if (not[i] > max) {
                max = not[i];

            }
        }
        return max;
    }

    public static void getGrades(int[] not, char[] harfNotu) {
        int enIyi = max(not);
        for (int i = 0; i < harfNotu.length; i++) {
            if (not[i] > enIyi - 10) {
                harfNotu[i] = 'A';
            } else if (not[i] > enIyi - 20) {
                harfNotu[i] = 'B';

            } else if (not[i] > enIyi - 30) {
                harfNotu[i] = 'C';
            } else if (not[i] > enIyi - 40) {
                harfNotu[i] = 'D';

            } else
                not[i] = 'F';

        }
    }

}
