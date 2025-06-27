package cp05Questions;

public class Toplama {
    public  static void main(String args[]) {
        double toplam = 0;
        for(int i=1;i<625;i++) {
            toplam+=1/(Math.sqrt(i)+Math.sqrt(i+1));

        }
        System.out.println("toplam : " + toplam);


    }
}
