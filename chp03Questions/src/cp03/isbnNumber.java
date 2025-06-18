package cp03;

import java.util.Scanner;

public class isbnNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("isbn numaranızın ilk 9 haneisni giriniz");
        int number=input.nextInt();

        int d1 = number / 100000000 ;
        int remaining =  number % 100000000 ;
        int d2 = remaining / 10000000;
         remaining =  remaining % 10000000 ;
        int d3 = remaining / 1000000;
         remaining =  remaining % 1000000 ;
        int d4 = remaining / 100000;
         remaining =  remaining % 100000 ;
        int d5 = remaining / 10000;
         remaining =  remaining % 10000 ;
        int d6 = remaining / 1000;
        remaining =  remaining % 1000 ;
        int d7 = remaining / 100;
         remaining =  remaining % 100 ;
        int d8 = remaining / 10;
         remaining =  remaining % 10 ;
        int d9 = remaining;

        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)% 11 ;

        if  (d10 == 10){
            System.out.println("X");
        }
        else System.out.println(d10);



    }
}
