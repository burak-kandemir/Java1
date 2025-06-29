package cp05Questions;

import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int sayac = 0;

        System.out.println("en büyüğünü bulmamı istediğiniz sayıları giriniz");


        while (true) {
            int sayi = input.nextInt();
            if (sayi == 0) {
                break;

            }
            if (sayi > max) {
                max = sayi;

            }
            sayac++;
        }
            if (sayac ==0) {
                System.out.println("Hiç sayı girilmedi");
            }else
            System.out.println(sayac + " sayının arasından en büyük olanı : " + max);

        }
    }





