package cp06Questions;

import java.util.Scanner;

public class Approximateroot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kökünün bulunmasını istediğiniz sayıyı giriniz");
        long sayi = scan.nextLong();
        System.out.println("yaklaşık kök değeri : " + sqrt(sayi));

    }

    public static double sqrt(long n) {

        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        while (Math.abs(nextGuess - lastGuess) > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess;
    }
}

