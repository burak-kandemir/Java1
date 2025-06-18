package cp04Questions;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("çokgende kaç kenar olduğunu giriniz");
        int kenar = input.nextInt();
        System.out.println("kenar uzunluğunu giriniz" );
        double uzunluk = input.nextDouble();

        double area = (kenar * Math.pow(uzunluk, 2) / (4 * Math.tan(Math.PI / kenar)));

        System.out.println("çokgenin alanı : " + area + " dır" );
    }
}
