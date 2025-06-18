package cp04Questions;

import java.util.Scanner;

public class GreatCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci noktaları giriniz");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("ikinci noktaları giriniz");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

       final double radius = 6371.01;

       double d = radius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));

        System.out.println("İki nokta arasında olan uzaklık : " + d  + " km'dir.");


    }

}
