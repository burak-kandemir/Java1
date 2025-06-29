package cp05Questions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("tersinin yazılmasını istediğiniz kelimeyi giriniz");
        String kelime = scan.nextLine();
        int length = kelime.length();
        String ters = "";
        for (int i = length-1; i >= 0; i--) {
            ters+=kelime.charAt(i);

        }System.out.print("Girdiğininz kelimenin tersi : " + ters);
    }
}
