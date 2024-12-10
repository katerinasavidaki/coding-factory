package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά, δευτερόλεπτα
 * σε συνολικά δευτερόλεπτα.
 * Ο χρήστης δίνει τα δεδομένα και εκτυπώνεται το τελικό αποτέλεσμα
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTE = 60;

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert days, hours, minutes, seconds");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();

        totalSeconds = days * SEC_PER_DAY + hours * SEC_PER_HOUR + minutes * SEC_PER_MINUTE + seconds;

        System.out.printf(Locale.US, "Total seconds: %,d seconds\n", totalSeconds);


    }
}
