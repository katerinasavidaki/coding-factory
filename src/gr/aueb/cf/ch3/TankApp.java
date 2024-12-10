package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true / false από το stdio
 * για τις δυο δεξαμενές αν είναι < 1/4
 * Επεξεργάζεται και ανάβει πορτοκαλί αν
 * η μία είναι < 1/4 και κόκκινο αν και
 * οι δυό είναι < 1/4
 */
public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert tank status (true/false)");
        System.out.println("Tank1 status: ");
        isEmptyTank1 = in.nextBoolean();

        System.out.println("Tank2 status: ");
        isEmptyTank2 = in.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange: " + isOrange + "," + "Red:" + isRed);
    }
}
