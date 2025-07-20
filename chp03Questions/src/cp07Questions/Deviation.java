package cp07Questions;

import java.util.Scanner;

public class Deviation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];


        System.out.print("10 tane sayı giriniz. ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));
    }

    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (double e : x) {
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }



    public static double mean(double[] x) {
        double mean = 0;
        for (double e : x) {
            mean += e;
        }
        return mean / x.length;
    }
}