
import java.util.Scanner;

public class DersNotu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ders notunuzu giriniz");
        int Dersnotu = input.nextInt();
        if (Dersnotu >= 90) {
            System.out.println(" A ");
        }
            else if (Dersnotu >= 80) {
            System.out.println(" B ");
        }
                else if (Dersnotu >= 70) {
            System.out.println(" C ");
        }
                    else if (Dersnotu >= 60) {
            System.out.println(" D ");
        }
                        else
                        System.out.println(" F ");

                    }
                }

