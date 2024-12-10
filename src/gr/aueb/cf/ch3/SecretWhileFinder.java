package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο
 */
public class SecretWhileFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;
        boolean success = false;

        do {

            System.out.println("Insert a number to guess the secret number");
            inputNum = in.nextInt();

            if (inputNum == SECRET) {
                System.out.println("Secret found!!");
                success = true;
            } else {
                System.out.println("Try again!");
            }
        } while (!success);
    }
}
