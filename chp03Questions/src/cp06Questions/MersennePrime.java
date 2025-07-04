package cp06Questions;

public class MersennePrime {
    public static void main(String[] args) {
        System.out.printf("%-5s %-15s\n", "p", "2^p - 1 (Mersenne Prime)");

        for (int i = 2; i <= 31; i++) {
            long mersenne = Mersenne(i);
            if (isPrime(mersenne)) {
                System.out.printf("%-5d %-15d\n", i, mersenne);
            }
        }
    }

    public static boolean isPrime(long sayi) {
        for (long i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long Mersenne(int p) {
        return (long) Math.pow(2, p) - 1;
    }
}
