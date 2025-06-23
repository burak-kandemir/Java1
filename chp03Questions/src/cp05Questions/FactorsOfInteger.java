package cp05Questions;

import java.util.Scanner;

public class FactorsOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("çarpanlarına ayırmak ve çarpanları görmek için bir sayı giriniz");
        int sayi = scan.nextInt();
        for (int j = 2; j <= sayi; j++) {
           while (sayi%j==0) {
               System.out.print(j + " ");
               sayi /=j;

           }


            }

        }
}
