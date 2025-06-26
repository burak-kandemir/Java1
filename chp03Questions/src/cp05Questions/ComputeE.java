package cp05Questions;



public class ComputeE {
    public static void main(String[] args) {
        double e =0 ;
        double faktoriyel = 1;

        for (int i = 1; i <= 10000; i++) {
            faktoriyel *= i;

               e += 1/faktoriyel;

            }
        System.out.println("10000 değeri için E : " + e);

        }
    }
