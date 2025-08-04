package cp08;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] sudoku = new int[9][9];

        System.out.println("Sudoku tablosunu girin (0 = boş hücre):");

        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + ". satırı gir (9 sayı, boşlukla ayrılmış):");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }
        System.out.println("\nGirilen Sudoku tahtası:\n");
        printSudoku(sudoku);
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print((sudoku[i][j] == 0 ? "." : sudoku[i][j]) + " ");
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("* * * * * * * * * * *");
            } else if (i != 8) {
                System.out.println("---------------------");
            }
        }
    }
}