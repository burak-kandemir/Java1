package cp04.calıismalar;

import java.util.Scanner;

public class IkiSehriKiyaslama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir şehir giriniz");
        String sehir1 = input.nextLine();
        System.out.println("bir şehir daha giriniz");
        String sehir2 = input.nextLine();
    if(sehir1.compareTo(sehir2) > 0){
        System.out.println("şehirleri sıralı şekilde yazdırıyoruz : " +sehir1 + " " + sehir2);

    }   else
        System.out.println("şehirleri sıralı şekilde yazdırıyoruz : " +sehir2 + " " + sehir1);
    }
}
