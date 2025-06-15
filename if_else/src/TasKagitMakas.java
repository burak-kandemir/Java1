import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pc = (int)(Math.random()*3);

        System.out.println("taş için 0 kağıt için 1 veya makas için 2 tuşuna basınız");
        int secim =  sc.nextInt();

        switch (pc){
            case 0:
                if(secim==0){
                    System.out.println("berabere");
                } else if (secim == 1) {
                    System.out.println("Tebrikler kazandınız");
                }else{
                    System.out.println("kaybettiniz.");
                }
                break;
            case 1:
                if(secim==0){
                    System.out.println("kaybettiniz");
                }else if(secim==1){
                    System.out.println("berabere");
                }else{
                    System.out.println("Tebrikler kazandınız.");
                }break;

                case 2:
                    if(secim==0){
                    System.out.println("kaybettiniz");
                    }else if(secim==1){
                        System.out.println("Tebrikler kazandınız.");
                    }else {
                        System.out.println("berabere");
                    }break;

        }
        System.out.println("bilgisayar seçimi : " + pc);

    }
}
