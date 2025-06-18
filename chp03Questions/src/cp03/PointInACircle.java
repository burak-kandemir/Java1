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

    public static class ucgenCilariHesaplama {


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.println("A noktasının koordinatlarını girin (x ve y):");
                double ax = scanner.nextDouble();
                double ay = scanner.nextDouble();

                System.out.println("B noktasının koordinatlarını girin (x ve y):");
                double bx = scanner.nextDouble();
                double by = scanner.nextDouble();

                System.out.println("C noktasının koordinatlarını girin (x ve y):");
                double cx = scanner.nextDouble();
                double cy = scanner.nextDouble();



            }
        }
}
