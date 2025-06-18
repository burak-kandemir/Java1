package cp04Questions;

import java.util.Scanner;

public class Decimal2Hex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir decimal değeri giriniz (0 dan 15e kadar)");
        int decimal = scan.nextInt();

        if (decimal < 0 && decimal > 9) {
            System.out.println("hex değeri : " + decimal);

        }else if (decimal >10 && decimal <15) {
            System.out.println("hex değeri : " + (char)(decimal + 'A' -10));

        }else
            System.out.println("yanlış değer girdiniz.");
        }
    }

