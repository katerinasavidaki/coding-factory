package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch / case
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα ακόλουθα:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team-game");
            System.out.println("4. Quit");

            choice = in.nextInt();
//            if (choice < 1 || choice > 4) {
//                System.out.println("Choice must be between 1-4");
//                System.out.println("Try again");
//                continue;
//            }

//            if (choice == 1) {
//                System.out.println("One-player game started");
//            } else if (choice == 2) {
//                System.out.println("Two-player game started");
//            } else if (choice == 3) {
//                System.out.println("Team game started");
//            } else {
//                System.out.println("Quiting..");
//            }

            switch (choice) {
                case 1:
                    System.out.println("One-player game started");
                    break;
                case 2:
                    System.out.println("two player game started");
                    break;
                case 3:
                    System.out.println("Team game started");
                case 4:
                    System.out.println("Quiting...");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        } while (choice != 4);

    }
}
