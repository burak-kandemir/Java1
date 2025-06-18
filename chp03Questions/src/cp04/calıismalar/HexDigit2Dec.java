package cp04.calıismalar;

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hex değeri giriniz");
        String hex = scan.next();
        if (hex.length() !=1){
            System.err.println("tek karakter girilmeliydi");
            System.exit(0);
            
        }

    }
}
