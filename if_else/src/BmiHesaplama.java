import java.util.Scanner;

public class BmiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kg = scan.nextDouble();
        System.out.println(" lütfen boyunuzu m cinsinden giriniz. (örn: 1,71)");
        double boy = scan.nextDouble();

        double bmi = kg / (boy*boy);

        if (bmi<18.5){
            System.out.println("bmi = " + bmi +   "yani underweight");

        }else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("bmi = " + bmi +   "yani normal");
        }else if (bmi>=25 && bmi<=29.9){
            System.out.println("bmi = " + bmi +   "yani overweight");
        }else {
            System.out.println("bmi = " + bmi +   "yani obese");
        }

    }
}
