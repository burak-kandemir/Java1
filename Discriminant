import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Discrimant hesabı yapılabilmesi için a, b ve c değerlerini giriniz");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double discriminant = (b*b)-(4*a*c);

        double r1 = (-b)+((Math.sqrt((b*b)-(4*a*c)))/(2*a));
        double r2 = (-b)-((Math.sqrt((b*b)-(4*a*c)))/(2*a));

if (discriminant > 0  ) {
    System.out.println(" denkleminizin 2 kökü vardır . Bunlar :" + r1 + " ve " + r2 + " dir.");

} else if (discriminant == 0 ) {
    System.out.println("denkleminizin 1 kökü vardır ve bu kök :" + r1 + " dir. ");
}else
    System.out.println("denkleminizin kökü yoktur.");


    }
}
