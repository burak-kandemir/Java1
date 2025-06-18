package cp03;

import java.util.Scanner;

public class calismalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("numara girin");
        int n = sc.nextInt();
         int n1 = n / 1000000000;
         int n2 = n % 1000000000;

        System.out.println("n1 : " + n1 + " n2 : " + n2);

    }


}
