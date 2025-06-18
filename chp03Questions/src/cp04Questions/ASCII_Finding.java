package cp04Questions;

import java.util.Scanner;

public class ASCII_Finding {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir ASCII kodu giriniz : ");
        int ascii = scan.nextInt();

        System.out.println("girdiğiniz karakterin ascii kodu : " + (char) ascii);


    }
}
