package cp08;

import java.util.Scanner;

public class VergiHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};


        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        System.out.println("0: Single filer");
        System.out.println("1: Married jointly or qualifying widow(er)");
        System.out.println("2: Married separately");
        System.out.println("3: Head of household");
        System.out.print("Filing status girin (0-3): ");
        int status = input.nextInt();

        if (status < 0 || status > 3) {
            System.out.println("Geçersiz durum. Program sonlandırılıyor.");
            return;
        }

        System.out.print("Vergilendirilebilir gelir: ");
        double income = input.nextDouble();

        double tax = computeTax(brackets, rates, status, income);

        System.out.printf("Toplam vergi: %.2f\n", tax);
    }

    public static double computeTax(int[][] brackets, double[] rates, int status, double income) {
        double tax = 0;
        int[] limits = brackets[status];


        for (int i = 0; i < limits.length; i++) {
            if (income <= limits[i]) {
                if (i == 0) {
                    tax += income * rates[i];
                } else {
                    tax += (income - limits[i - 1]) * rates[i];
                    for (int j = 0; j < i; j++) {
                        tax += (limits[j] - (j == 0 ? 0 : limits[j - 1])) * rates[j];
                    }
                }
                return tax;
            }
        }


        for (int i = 0; i < limits.length; i++) {
            double lower = (i == 0) ? 0 : limits[i - 1];
            tax += (limits[i] - lower) * rates[i];
        }

        tax += (income - limits[limits.length - 1]) * rates[rates.length - 1];

        return tax;
    }
}
