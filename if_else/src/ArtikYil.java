import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir yıl giriniz");
        int yil = input.nextInt();

        boolean artikYil = true;

        artikYil = (yil % 4 == 0 && yil %100 !=0) || (yil % 400 == 0);

        if (artikYil) {
            System.out.println( yil + " yılı artık yıldır");

        }else
            System.out.println(yil + " yılı artıl yıl değildir");

    }
}
