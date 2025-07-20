package cp07Questions;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] counts = new int[101];

        System.out.println("Enter numbers between 1 and 100 (end with 0):");

        while (true) {
            int number = in.nextInt();

            if (number == 0) {
                break;
            }

            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Only numbers between 1 and 100 are counted.");
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }

        in.close();

    }


}
