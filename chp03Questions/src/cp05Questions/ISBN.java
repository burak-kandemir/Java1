package cp05Questions;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ISBN numaranızın ilk 9 hanesini giriniz.");
        String isbn9 =  scan.nextLine();
       if(isbn9.length() != 9) {
           System.out.println("hatalı giriş yaptınız");
           return;
       }
int toplam = 0;
       for (int i = 0; i < 9; i++) {
           char ch = isbn9.charAt(i);
           if (!Character.isDigit(ch)) {
               System.out.println("hatalı giriş yaptınız. Sadece rakam giriniz");
               return;

           }int digit = Character.getNumericValue(ch);
           toplam += digit*(i+1);
       }int d10 = toplam%11;
if(d10==10) {
    System.out.println(" X ");
}else {
    System.out.println(d10);
}

               }

    }

