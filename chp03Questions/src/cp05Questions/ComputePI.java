package cp05Questions;

import org.w3c.dom.ls.LSOutput;

public class ComputePI {
    public static void main(String[] args) {

        double toplam = 0;

        for (int i = 1; i <= 10000; i++) {
            toplam += Math.pow(-1, i+1)/(2*i-1);


        }double PI =4 * toplam;
        System.out.println("Toplam PI : " + PI);
    }

}
