package cp03;

import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iki koordinat noktası giriniz");
        double p1 = input.nextDouble();
        double p2 = input.nextDouble();

        double circle = Math.sqrt(Math.pow(p1,2)+Math.pow(p2,2));

        if (circle<=10){
            System.out.println("koordinatlar dairenin içinde");
        }else{
            System.out.println("oordinatlar dairenin dışında");
        }
    }
}
