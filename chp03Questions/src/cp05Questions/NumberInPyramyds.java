package cp05Questions;

import java.util.Scanner;

public class NumberInPyramyds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("piramidinizin ikinin kaçıncı kuvvetinden oluşmasını istersiniz");
        int kuvvet1 = input.nextInt();
       int kuvvet = kuvvet1+1;

        for (int i = 0; i < kuvvet; i++) {
            for (int j = 0; j <= kuvvet-i-1 ; j++) {
                System.out.print("    ");

            } for (int j = 0; j <=i; j++) {
                System.out.printf("%4d" ,(int) Math.pow(2,j));
            }for (int j = i-1; j >= 0; j--) {
                System.out.printf("%4d" , (int)Math.pow(2,j));

            }
            System.out.println();
        }

    }
}