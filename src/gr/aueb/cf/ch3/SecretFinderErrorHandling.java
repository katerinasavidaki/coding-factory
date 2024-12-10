package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearize the branches and check
 * errors first
 */
public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;
        boolean success = false;

        while (true) {
            System.out.println("Insert a number to guess the secret number");
            inputNum = in.nextInt();

            if (inputNum != SECRET) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Bingo!");
            break;
        }
    }
}
