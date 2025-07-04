package cp06Questions;

public class PalindromicPrime {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i =2; i<=10000; i++){
            if (isPrime(i) && isPalindrome(String.valueOf(i))){
                System.out.printf("%4d",i );
                sayac++;
                if(sayac%10==0){
                    System.out.println();
                }
            }
        }

    }

    public static boolean isPalindrome(String sayi) {


        int length = sayi.length();
        for (int i = 0; i < sayi.length()/2 ; i++) {
            if (sayi.charAt(i) != sayi.charAt(length-1-i)) {
                return false;
            }
        }
        return true;
    }
            public static boolean isPrime(int sayi){
                for (int i =2; i<=Math.sqrt(sayi); i++){
                    if (sayi%i==0){
                        return false;
                    }
                }return true;

            }
        }






