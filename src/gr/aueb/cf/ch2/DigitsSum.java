package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει ως input από τον χρήστη
 * έναν διψήφιο ακέραιο και εκτυπώνει το άθροισμα
 * των ψηφίων του. (Π.χ αν ο χρήστης δώσει τον ακέραιο
 * 15 θα πρέπει το αποτέλεσμα να είναι 1 + 5 = 6.
 */
public class DigitsSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNumber = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        System.out.println("Please insert a two digits integer");
        inputNumber = in.nextInt();
        leftDigit = inputNumber / 10; //με div παιρνουμε το αριστερο ψηφιο
        rightDigit = inputNumber % 10; //με mod παιρνουμε το δεξι ψηφιο
        sumOfDigits = rightDigit + leftDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum %d",
                inputNumber, leftDigit, rightDigit, sumOfDigits);
    }
}
