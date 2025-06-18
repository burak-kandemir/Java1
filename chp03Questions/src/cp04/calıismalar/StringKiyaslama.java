package cp04.calıismalar;

import java.util.Scanner;

public class StringKiyaslama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = "Merhaba Java";
        String str2 = "Merhaba Java sinifi";

        boolean b = str1.equals(str2);
if (b==true){
    System.out.println("iki string birbirine eşit");

}else{
    System.out.println("iki string birbirine eşit değil ");
}

    }
}
