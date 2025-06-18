package cp03;

import java.util.Scanner;

public class AlgebraSolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lineer çözüm yapanilmek için a,b,c,d,e,f değerlerini giriniz.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = ((e*d) - (b*f)) / ((a*d) - (b*c));
        double y = ((a*f) - (e*c)) / ((a*d) - (b*c));
        double z = ((a*d) - (b*c));

        if (z== 0 ){
            System.out.println("Problemin herhangi bir çözümü yoktur.");

        }else
            System.out.println("x : " + x + " ve y: " + y);

    }
}
