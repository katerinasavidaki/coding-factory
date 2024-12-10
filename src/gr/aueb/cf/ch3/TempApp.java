package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβανει μια θερμοκρασια απο τον χρηστη
 * και εμφανιζει καταλληλο μηνυμα.
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("The temperature is below zero: " + isTempBelowZero);

    }
}
