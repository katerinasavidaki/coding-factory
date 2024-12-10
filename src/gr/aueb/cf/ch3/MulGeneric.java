package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το γινόμενο των n πρώτων ακεραίων.
 */
public class MulGeneric {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //to 1 einai to oudetero stoixeio tou pol/mou
        int result = 1;
        int i = 1;
        int n = 0;

        System.out.println("Insert n");
        n = in.nextInt();

        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.println("Result is: " + result);
    }
}
