package cp06Questions;

public class TaxTable {
    public static void main(String args[]) {
        System.out.printf("%-15s%-20s%-30s%-20s%-20s\n",
                "Taxable Income",
                "Single",
                "Married Joint or Qualifying Widow(er)",
                "Married Separated",
                "Head of Household");
        for (int income = 50000; income<=60000; income+=50) {
            System.out.printf("%-15d", income);
            System.out.printf("%-20.0f", single(income));
            System.out.printf("%-30.0f", MarriedFilingJointly(income));
            System.out.printf("%-20.0f", marriedFilingSeparately(income));
            System.out.printf("%-20.0f", HeadOfHousehold(income));
            System.out.println();


        }


    }

    public static double single(double income) {
        double tax = 8350 * 0.1 + (33950-8350) * 0.15 + (income-33950) * 0.25;
        return tax;
    }

    public static double MarriedFilingJointly(double income) {

        double tax = 16700 * 0.1 + (income-16700) * 0.15;
        return tax;
    }

    public static double marriedFilingSeparately(double income) {

        double tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income-33950) * 0.25;
        return tax;
    }

    public static double HeadOfHousehold(double income) {
        double tax= 11950 * 0.1 + (45500 - 11950) * 0.15 + (income-45500) * 0.25;
        return tax ;


    }
}
