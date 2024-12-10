package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρηστης θα δινει:
 * 1. τους συνολικους βαθμους μαθηματων
 * 2. το πληθος των μαθηματων
 *
 * θα υπολογιζει τον Μ.Ο και θα χαρακτηριζει
 * 'Αριστα' αν ο Μ.Ο >= 9, 'Πολυ καλα' αν Μ.Ο >= 7
 * 'Καλως' αν ο Μ.Ο >= 5 και 'Αποτυχια' αν Μ.Ο < 5
 *
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = in.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero");
            System.exit(1);
        }

        System.out.println("Please insert number of courses");
        coursesCount = in.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses can not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("good");
        } else {
            System.out.println("failure");
        }
    }
}
