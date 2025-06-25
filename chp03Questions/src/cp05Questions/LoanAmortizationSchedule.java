package cp05Questions;

import java.util.Scanner;

public class LoanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter loan amount");
        double loanAmount = input.nextDouble();
        System.out.println("enter number of years");
        double years = input.nextDouble();
        System.out.println("enter annual interest rate");
        double interestRate = input.nextDouble();
        double MonthlyIntrest = interestRate/1200;
        double MonthlyPayment = loanAmount * MonthlyIntrest/(1-1/Math.pow(1+MonthlyIntrest,years*12));
        double totalPayment = MonthlyPayment*years*12;
        System.out.println("Monthly payment : " + MonthlyPayment + "\nTotal payment : " + totalPayment);
        double balance = loanAmount,
                principal, interest;
        System.out.println("Payment#     Interest     Principal     Balance");
        for (int i = 1; i <= years * 12; i++) {
            interest = MonthlyIntrest * balance;
            principal = MonthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,
                    principal, balance);

     }

    }
}
