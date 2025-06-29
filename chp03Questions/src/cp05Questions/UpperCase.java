package cp05Questions;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();
        int length = str.length();
        int sayacBuyuk = 0;
        int sayacKucuk = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i)>=65 && str.charAt(i)<=90) {
                sayacBuyuk++;
            }else if (str.charAt(i)>=97 && str.charAt(i)<=122) {
                sayacKucuk++;
            }

        }System.out.println("büyük harf sayısı: " + sayacBuyuk + " \nKüçük harf sayısı: " + sayacKucuk);
    }
}
