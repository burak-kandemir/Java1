package cp06Questions;

public class TwinPrimes {
    public static void main(String[] args) {
        printTwinPrimes(1000);

    }

        public static void printTwinPrimes(int limit) {
            for (int i = 2; i <= limit - 2; i++) {
                if (isPrime(i) && isPrime(i + 2)) {
                    System.out.printf("(%d, %d)\n", i, i + 2);
                }
            }
        }




    public static boolean isPrime(int sayi) {
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}