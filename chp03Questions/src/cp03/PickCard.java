package cp03;

import java.util.Scanner;

public class PickCard {
    public static void main(String[] args) {
        int rank = (int) (Math.random() * 13) + 1;
        int suit = (int) (Math.random() * 4) + 1;

        switch (rank) {
            case 1:
                System.out.print("ace");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("queen");
                break;
            case 12:
                System.out.print("queen");
                break;
            case 13:
                System.out.print("king");

        }
        System.out.print(" of ");

                                switch (suit) {
                                    case 1:
                                        System.out.println("clubs");
                                        break;
                                        case 2:
                                            System.out.println("diamonds");
                                            break;
                                            case 3:
                                                System.out.println("hearts");
                                                break;
                                    case 4:
                                        System.out.println("spades");
                                }


        }

    }

