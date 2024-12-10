package gr.aueb.cf.ch7;

/**
 * Τα Strings ειναι immutable και δεν
 * επηρεαζει το αντιγραφο της αναφορας
 * Οπότε εχουμε εγκυρο copy με αντιγραφη
 * της αναφορας
 */
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;

        System.out.println(s1);
        System.out.println(s2);
    }
}
