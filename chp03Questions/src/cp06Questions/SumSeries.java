package cp06Questions;

public class SumSeries {
    public static void main(String[] args) {

        System.out.println("i      m(i)");
        System.out.println("------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-6d %.4f%n", i, sumSeries(i));
        }


    }

    public static double sumSeries(int m) {
        double toplam = 0;
        for (int i = 1; i <= m; i++) {

            toplam += (double) i / (i + 1);
        }
        return toplam;
    }
}
