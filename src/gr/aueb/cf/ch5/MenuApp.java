package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ενα μενού επιλογών στον χρήστη
 * και αυτός επιλέγει ένα menu item και στη συνέχεια
 * ανάλογα με το τι έχει επιλέξει, εκτελείται κάποια ενέργεια
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice is not valid");
                continue;
            }

            doOnChoice(choice);
        } while (choice != 5);

    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή");
                break;
            case 2:
                System.out.println("Διαγραφή");
                break;
            case 3:
                System.out.println("Αναζήτηση");
                break;
            case 4:
                System.out.println("Ενημέρωση");
                break;
            case 5:
                System.out.println("Έξοδος");
                break;
            default:
                System.out.println("Λάθος Επιλογή");
                break;
        }
    }
}
