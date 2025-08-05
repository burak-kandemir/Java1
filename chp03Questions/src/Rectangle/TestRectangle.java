package Rectangle;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin genişliğini giriniz");
        double width = input.nextDouble();

        System.out.println("Dikdörtgenin yüksekliğini giriniz");
        double height = input.nextDouble();

        Rectangle r = new Rectangle(width, height);
        System.out.println("\nGirdiğiniz dikdörtgenin bilgileri:");
        System.out.println("Genişlik: " + r.getWidth());
        System.out.println("Yükseklik: " + r.getHeight());
        System.out.println("Alan: " + r.getArea());
        System.out.println("Çevre: " + r.getPerimeter());
    }
}
