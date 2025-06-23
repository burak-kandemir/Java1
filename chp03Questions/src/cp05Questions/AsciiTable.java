package cp05Questions;

public class AsciiTable {
    public static void main(String[] args) {
        int count = 0;
        for(int ch = 33; ch<127; ch++){
            System.out.print((char)ch + " ");
           count ++;
           if (count % 10 ==0)
               System.out.println();

        }

        }

    }

