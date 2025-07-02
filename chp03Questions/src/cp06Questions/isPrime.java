package cp06Questions;

public class isPrime {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 2; i <= 10000; i++) {
            if (IsPrime(i)) {
                System.out.printf("%-6d", i);
                sayac++;

                if (sayac % 10 == 0) {
                    System.out.println();
                }
            }

        }

    }

    public static boolean IsPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;

            }
        }
        return true;

    }
}