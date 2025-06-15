import java.util.Scanner;

public class TestMantikOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();

        if (sayi % 2 ==0 && sayi % 3 ==0) {
            System.out.println("sayı 2 ve 3 ile tam bölünüyor");
        }if (sayi % 2 ==0 || sayi % 3 ==0) {
            System.out.println("sayı 2 veya 3 ile tam bölünüyor");
        }if (sayi % 2 == 0 ^ sayi % 3 == 0) {
            System.out.println(" sayi 2 veya 3 ile bölünüyor ancak her ikisine bölünmüyor");

        }
    }
}
