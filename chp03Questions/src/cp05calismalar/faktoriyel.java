package cp05calismalar;

import java.util.Scanner;

public class faktoriyel {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faktoriyelini öğrenmek istediğiniz sayıyı giriniz.");
        int n = sc.nextInt();
        int faktoriyel = 1;
        for (int i= 1; i<= n; i++) {
           faktoriyel *= i;
        }
        System.out.println( n + " sayısının faktoriyeli : " + faktoriyel);
    }
}
