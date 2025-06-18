package cp03;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dolardan tlye exchange oranını giriniz.");
        double exchange = input.nextDouble();

        System.out.println("dolardan tlye çevirmek için 0 tlden dolara çevirmek için 1 tuşuna basınız.");
        int cins = input.nextInt();
        if (cins == 0) {
            System.out.println("dolar miktarınızı giriniz");
            double dolar = input.nextDouble();
            double miktarTl = exchange * dolar;
            System.out.println(dolar + " dolar " + miktarTl + " TL dir");

        } else if (cins == 1) {
            System.out.println("TL miktarını giriniz");
            double tl = input.nextDouble();
            double miktardolar = tl / exchange;

            System.out.println(tl + " TL " + miktardolar + " dolar dır");
        }else{
            System.out.println("yanlış giriş yaptınız");
        }
    }
}

