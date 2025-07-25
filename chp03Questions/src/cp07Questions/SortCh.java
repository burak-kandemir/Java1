package cp07Questions;

import java.util.Scanner;

public class SortCh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("bir string giriniz");
        String birString = in.nextLine();
        char[] harfler = birString.toCharArray();
        sort(harfler);
        System.out.println("\n Sıralanmış harfler");
        for (char n : harfler) {
            System.out.print(n + " ");

        }

    }

    public static void sort(char[] String) {
        for (int i = 0; i < String.length - 1; i++) {
            for (int j = i + 1; j < String.length; j++) {
                if (String[i] > String[j]) {
                    char temp = String[i];
                    String[i] = String[j];
                    String[j] = temp;

                }
            }
        }

    }
}
