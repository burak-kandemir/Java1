package cp06Questions;

import java.util.Scanner;

public class FinancialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter investment amount");
        double investmentAmount = input.nextDouble();
        System.out.println("enter annual investment rate");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int years = 30;
        System.out.println("Years        Future Value");
        System.out.println("--------------------------");
        for (int i  = 1; i <= years; i++) {
            double futureValue = futureInvestmentValue(investmentAmount,monthlyInterestRate,i);
            System.out.printf("%-12d %.2f%n", i, futureValue);

        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double value = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        return value;

    }
}
