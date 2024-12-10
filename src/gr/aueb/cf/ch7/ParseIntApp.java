package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Μετατρέπει ενα String σε ακέραιο.
 */
public class ParseIntApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an int");
        s = in.nextLine();
        num = Integer.parseInt(s);     //το μετατρεπει σε INT εαν μόνο το s είναι ψηφίο και οχι λέξη

        System.out.println(num);
    }
}
