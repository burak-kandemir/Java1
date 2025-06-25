package cp05Questions;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter loan amount : ");
        double loanAmount = input.nextDouble();
        System.out.println("enter loan period ( as a year ) : ");
        double loanPeriod = input.nextDouble();




        System.out.println(" Interest Rate      Monthly Payment      Total Payment");
        System.out.println("--------------------------------------------------------");

        for (double i = 5; i<=8; i+=0.25 ){
            double MonthlyIntrest = i/1200;
            double MonthlyPayment = loanAmount * MonthlyIntrest/(1-1/Math.pow(1+MonthlyIntrest,loanPeriod*12));
            double totalPayment = MonthlyPayment*loanPeriod*12;
            System.out.printf("%-15.3f%-20.2f%-15.2f%n", i, MonthlyPayment, totalPayment);
        }

    }
}
