package cp05Questions;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = input.nextLine();
        str = str.trim();
        int length = str.length();
        String odd = "";

        for (int i = 0; i < length; i+=2) {
            odd+=str.charAt(i);
        }
        System.out.println(odd);
    }
}
