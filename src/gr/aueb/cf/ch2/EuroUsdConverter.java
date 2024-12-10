package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει απο τον χρηστη ενα ποσο σε Ευρω
 * και μετατρεπει απο ευρω σε USD και cents.
 * Η ισοτιμια 99 cents = 1 ευρω και εκτυπωνει το αποτελεσμα
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        final int PARITY = 99;
        int usaCents = 0;

        // Εντολές
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d \u20AC = %d usa \u0024, %d usa cents", inputEuros, usaDollars, usaCents);


    }
}
