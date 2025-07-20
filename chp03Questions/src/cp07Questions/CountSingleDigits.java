package cp07Questions;

public class CountSingleDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            counts[(int) (Math.random() * 10)]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " " + counts[i] + " tane vardır");
        }
    }
}
