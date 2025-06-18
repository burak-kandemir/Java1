package cp04Questions;

import java.util.Scanner;

public class ÖgrenciSınıfVeBolumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bölüm ve sınıfınızı giriniz iki karakter olark giriniz (örn : M1)");
        String karakter = scan.nextLine();
        char ch1 = karakter.toUpperCase().charAt(0);
        char ch2 = karakter.toUpperCase().charAt(1);

      switch (ch1) {
          case 'M':
              System.out.println("matematik");
              break;
              case 'C':
                  System.out.println("computer engineering");
                  break;
                  case 'I':
                      System.out.println("information Tecnology");
                      break;
                      default:
                          System.out.println("yanlış değer girdiniz");
      }



        switch (ch2) {
            case '1':
                System.out.println("freshman");;
            break;
            case '2':
                System.out.println("sophomore");;
                break;
                case '3':
                    System.out.println("junior");;
                    break;
                    case '4':
                        System.out.println("senior");;
                        break;
            default: System.out.println("yanlış değer girdiniz");
      }



        }

    }

