package cp04Questions;


public class PlakaUretme {
    public static void main(String[] args) {
        char ch1 = (char)((Math.random()*25)+65);
        char ch2 = (char)((Math.random()*25)+65);
        char ch3 = (char)((Math.random()*25)+65);

        int n = (int)((Math.random()*10000)+999);

        System.out.println("plaka numaranız : " + ch1+ch2+ch3 + " " + n);
    }
}
