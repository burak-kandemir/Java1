package cp05calismalar;

import java.util.Scanner;

public class FaizUygulaması {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bankamızın faiz oranı %6'dır");
        double anapara;
        int vade;
        double faiz = 0.06;
        System.out.println("bankamıza ne kadar para yatırmak istiyorsunuz?");
        anapara = input.nextDouble();
        System.out.println("kaç yıl vade olsun istiyorsunuz?");
        vade = input.nextInt();

        for (int i = 1; i <= vade; i++ ) {
        anapara = anapara + (anapara * faiz) ;
            System.out.println(i + ".yılın sonunda toplam para " + (int)anapara);
        }
    }
}