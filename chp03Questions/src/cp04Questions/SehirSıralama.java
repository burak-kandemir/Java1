package cp04Questions;

import java.util.Scanner;

public class SehirSıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk şehir ismini giriniz");
        String s1 = input.nextLine();
        System.out.println("ikinci şehir ismini giriniz");
        String s2 = input.nextLine();
        System.out.println("üçüncü şehir ismini giriniz");
        String s3 = input.nextLine();
        if (s1.compareTo(s2) <= 0 && s2.compareTo(s3) <= 0) {
            // s1 <= s2 <= s3
            System.out.println(s1 + "\n" + s2 + "\n" + s3);
        } else if (s1.compareTo(s3) <= 0 && s3.compareTo(s2) <= 0) {
            // s1 <= s3 <= s2
            System.out.println(s1 + "\n" + s3 + "\n" + s2);
        } else if (s2.compareTo(s1) <= 0 && s1.compareTo(s3) <= 0) {
            // s2 <= s1 <= s3
            System.out.println(s2 + "\n" + s1 + "\n" + s3);
        } else if (s2.compareTo(s3) <= 0 && s3.compareTo(s1) <= 0) {
            // s2 <= s3 <= s1
            System.out.println(s2 + "\n" + s3 + "\n" + s1);
        } else if (s3.compareTo(s1) <= 0 && s1.compareTo(s2) <= 0) {
            // s3 <= s1 <= s2
            System.out.println(s3 + "\n" + s1 + "\n" + s2);
        } else {
            // s3 <= s2 <= s1
            System.out.println(s3 + "\n" + s2 + "\n" + s1);
        }


    }
}
