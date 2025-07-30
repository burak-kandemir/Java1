package cp08;


import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skorX = 0;
        int skorO = 0;

        System.out.println("İlk 3 galibiyete ulaşan kazanır! ");

        while (skorX < 3 && skorO < 3) {
            char currentPlayer = 'X';
            resetBoard();
            printBoard();

            while (true) {
                System.out.println("Sıra oyuncuda: " + currentPlayer);
                playerMove(scanner, currentPlayer);
                if (checkWin(currentPlayer)) {
                    if (currentPlayer == 'X') {
                        skorX++;
                        System.out.println("Oyuncu X bu seti kazandı!");
                    } else {
                        skorO++;
                        System.out.println("Oyuncu O bu seti kazandı!");
                    }
                    break;
                }

                if (isDraw()) {
                    System.out.println("Bu set berabere bitti! ");
                    break;
                }

                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

            System.out.println("Skor: X = " + skorX + " | O = " + skorO);
            System.out.println("------------------------------------");
        }

        if (skorX == 3) {
            System.out.println(" Oyuncu X maçı kazandı! Tebrikler!");
        } else {
            System.out.println(" Oyuncu O maçı kazandı! Tebrikler!");
        }

        scanner.close();
    }

    public static void resetBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    public static void printBoard() {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
        System.out.println();
    }

    public static void playerMove(Scanner scanner, char symbol) {
        int row, col;
        while (true) {
            System.out.print("Hamleni yap (" + symbol + ") - satır ve sütun: ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            } else {
                System.out.println("Geçersiz hamle. Lütfen tekrar dene.");
            }
        }
        printBoard();
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;

        return false;
    }

    public static boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return false;
        return true;
    }
}

