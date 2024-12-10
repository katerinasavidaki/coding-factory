package gr.aueb.cf.ch4;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * prints different outputs of stars
 */
public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1st row: 1 star etc. etc. Ascending order

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Descending
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

            for (int g = 1; g <= 10; g++) {
                for (int j = g; j <= 10; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
