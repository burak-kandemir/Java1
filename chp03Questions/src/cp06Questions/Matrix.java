package cp06Questions;

import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print((int)(Math.random()*2));
            }
            System.out.println();
        }

    }
}
