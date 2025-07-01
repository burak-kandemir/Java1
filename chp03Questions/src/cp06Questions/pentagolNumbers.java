package cp06Questions;

public class pentagolNumbers {
    public static void main(String[] args) {
        pentagolNumbers();
    }
    public static void pentagolNumbers(){
        for(int i=1;i<=10;i++){
            int penta = i*(3*i-1)/2;
            System.out.printf("%4d", penta);

        }
    }
}
