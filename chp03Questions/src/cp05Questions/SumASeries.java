package cp05Questions;

public class SumASeries {
    public static void main(String[] args) {
        int n = 100;
        double sum = 0.0;
        for (double i = 1; i < n; i++) {
            sum += i/(i+2);
        }
        System.out.println("sum = " + sum);
    }
}
