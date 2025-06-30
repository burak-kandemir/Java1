package cp06Calismalar;

import java.util.Scanner;

public class Faktoriyel {

    public static void faktoriyel() {

        Scanner input = new Scanner(System.in);
            System.out.println("faktoriyelinin bulunmasını istediğiniz sayıyı giriniz");
            int sayi = input.nextInt();
            int toplam = 1;
            for (int i = 1; i <= sayi; i++) {
                toplam *= i;

            }
            System.out.println("girdiğiniz sayının faktoriyeli :" + toplam);

        }

        public static void main (String[]args){

      faktoriyel();

        }
    }

