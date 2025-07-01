package cp06Questions;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }

    public static int sumDigits(long n) {

        int toplam = 0;
        while (n > 0) {
            toplam += n % 10;
            n = n / 10;


        }
        return toplam;

    }
}
