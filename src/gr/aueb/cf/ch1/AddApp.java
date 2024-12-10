package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        //Δηλωση και Αρχικοποιηση Μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Entoles
        result = num1 + num2;

        //Εκτυπωση του αποτελεσματος
        System.out.println("Το αποτέλεσμα ειναι: " +  result);
        System.out.println("Το αθροισμα των " + num1 + ", " + num2 + " ειναι ισο με: " + result);
        System.out.printf("το αθροισμα των %d, %d ειναι ισο με: %d\n" , num1, num2, result);
    }
}
