package cp05Questions;

import java.util.Scanner;

public class CommonPrefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = scan.nextLine();
        System.out.println("Enter one more string");
        String str2 = scan.nextLine();
       int i = 0;
       String prefix = "";
       while(str1.charAt(i)==str2.charAt(i)){
           prefix+=str1.charAt(i);
           i++;
       }if(prefix.length()>0){
           System.out.println("ortak prefix : " + prefix);
        }else{
            System.out.println("ortak prefiks yok.");
        }

    }
}
