package cp03;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gününü öğrenmek istediğiniz ayı giriniz ocak için  ... aralık için 12 ");
        int ay = input.nextInt();

        System.out.println("öğrenmek istediğiniz yılı giriniz");
        int yil = input.nextInt();

        boolean artikYil = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

        if (artikYil && ay == 2) {

            System.out.println(yil + " yılının şubat ayı 29 gündür");
        } else if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12) {
            System.out.println(yil + " yılının " + ay + " ayı 31 gündür.");

        } else if (ay == 4 || ay == 6 || ay == 9 || ay == 11 ){
            System.out.println(yil + " yılının " + ay + " ayı 30 gündür");
        }
        else{
            System.out.println(yil + " yılının " + ay + " ayı 28 gündür");
        }
    }
}