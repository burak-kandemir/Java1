package cp05calismalar;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str = input.nextLine();

        int a =str.length();
        boolean ispalidrome = true;

        for (int i = 0; i < a/2; i++) {
            if(str.charAt(i)!=str.charAt(a-1-i)) {
                ispalidrome = false;
            break;
            }
        }if(ispalidrome){
            System.out.println("bu bir palidrome");
        }else
        System.out.println(str + " bir polidrome değildir");
    }
}
