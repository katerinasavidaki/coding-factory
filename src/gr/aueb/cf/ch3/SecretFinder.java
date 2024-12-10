package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενα SECRET που ειναι integer και ο χρηστης προσπαθει να τον βρει
 * με μια μονο προσπαθεια
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;


        System.out.println("Insert a number to guess the secret number");
        inputNum = in.nextInt();

        if (inputNum == SECRET) {
            System.out.println("Secret found!!");
        } else  {     // inputNum != SECRET
            System.out.println("Failure!");
        }


    }
}
