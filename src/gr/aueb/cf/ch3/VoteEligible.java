package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψηφου σε ηλικιες > 18
 * Ελεγχει αν μια ηλικια εχει δικαιωμα να ψηφισει
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        int age = 0;

        System.out.println("Please insert your age");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.printf("You are eligible: %b ", isEligible);

    }
}
