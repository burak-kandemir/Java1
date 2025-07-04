package cp06Questions;

public class ConvertMillis {
    public static void main(String[] args) {

        System.out.println(ConvertMillis(5500));
        System.out.println(ConvertMillis(1000000));
        System.out.println(ConvertMillis(555550000));
    }

    public static String ConvertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;
        return hours + ":" + minutes + ":" + seconds;

    }
}
