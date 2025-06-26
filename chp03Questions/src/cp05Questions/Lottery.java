package cp05Questions;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit1 , digit2;
        digit1 = (int)(Math.random()*10);
        do {
            digit2 = (int)(Math.random()*10);
        } while(digit1 == digit2);

        int lottery = digit1*10+digit2;

        System.out.println("İki basamaklı, birbirinden farklı rakamlardan oluşan tahmininizi giriniz:");
        int piyango = input.nextInt();

        int guessDigit1 = piyango / 10;
        int guessDigit2 = piyango % 10;

        System.out.println("Piyango numarası: " + lottery);

        if (piyango == lottery) {
            System.out.println("Tebrikler! Tam isabet, 10.000 TL kazandınız!");
        } else if (guessDigit2 == digit1 && guessDigit1 == digit2) {
            System.out.println("Tebrikler! Rakamlar yer değiştirerek doğru, 3.000 TL kazandınız!");
        } else if (guessDigit1 == digit1 || guessDigit1 == digit2 ||
                guessDigit2 == digit1 || guessDigit2 == digit2) {
            System.out.println("Tebrikler! Bir rakam doğru, 1.000 TL kazandınız!");
        } else {
            System.out.println("Üzgünüm, kazanamadınız. Bir dahaki sefere!");
        }
    }
}