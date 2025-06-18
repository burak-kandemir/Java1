package cp04Questions;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        System.out.println("girdiğiniz karakterin sayılsal karşılığı : " + (int) karakter);
    }
}
