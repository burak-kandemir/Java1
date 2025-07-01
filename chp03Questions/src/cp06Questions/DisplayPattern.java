package cp06Questions;

import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("şekilinizin kaç atır olmasını istersiniz");
        int n = input.nextInt();
        display(n);

    }

    public static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j =  1; j <=n-i ; j++) {
                System.out.print("  ");

            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
