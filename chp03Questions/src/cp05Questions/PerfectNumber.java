package cp05Questions;

public class PerfectNumber {
    public static void main(String[] args) {



        for(int i=10000;i>=1;i--){
            int toplam =0;
            for (int j=1;j<=i/2;j++){
                if(i%j==0){
                    toplam +=j;

                }
                }if (i==toplam){
                    System.out.printf("%4d",i );

            }

        }
    }
}
