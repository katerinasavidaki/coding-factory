package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * User enters the number of stars,
 * and we print them with 5 different method ways.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStars = 0;

        System.out.println("Please enter number of stars");
        numOfStars = in.nextInt();

        System.out.println("n horizontal stars: ");
        for (int i = 0; i < numOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("n vertical stars");
        for (int i = 0; i < numOfStars; i++) {
            System.out.println("*");
        }
        System.out.println();

        System.out.println("N x N stars");
        for (int i = 0; i < numOfStars; i++) {
            for (int j = 0; j < numOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("1 to n stars");
        for (int i = 1; i <= numOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("n to 1 stars");
        for (int i = numOfStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
