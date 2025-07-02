package cp06Questions;

public class EstimatePI {
    public static void main(String[] args) {
        System.out.println("i      m(i)");
        System.out.println("------------");
        for (int i = 1; i < 1000; i += 100) {

            System.out.printf("%-6d %.6f%n", i, estimatePI(i));
        }
    }

    public static double estimatePI(double m) {
        double toplam = 0;
        for (double i = 1.0; i <= m; i++) {
            toplam += Math.pow(-1, (i + 1)) / (2 * i - 1);
        }
        double PI = 4 * toplam;
        return PI;
    }
}



