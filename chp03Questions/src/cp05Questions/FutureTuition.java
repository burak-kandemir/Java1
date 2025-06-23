package cp05Questions;

public class FutureTuition {
    public static void main(String[] args) {
        double anapara = 10.000;
        double faiz = 0.05;

for (int i =1;  i<=10;  i++){

    anapara += anapara*faiz;

}
        System.out.println(" 10 yıl sonunda paranızın miktarı : " + anapara + " dır");
    }
}
