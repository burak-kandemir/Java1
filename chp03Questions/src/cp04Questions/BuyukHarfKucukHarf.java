package cp04Questions;

import java.util.Scanner;

public class BuyukHarfKucukHarf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("büyük yada küçük bir harf giriniz.");
        char karakter = scan.next().charAt(0);
        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println(karakter + " büyük harfdir.");

        } else if (karakter >= 'a' && karakter <= 'z') {
            System.out.println(karakter + " küçük harftir.");

        }else
            System.out.println("yanlış değer girdiniz.");
    }
}
