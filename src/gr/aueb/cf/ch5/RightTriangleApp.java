package gr.aueb.cf.ch5;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

/**
 * checks if a triangle is right (orthogonio)
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;

        System.out.println("Please enter b, c, a");
        b = in.nextDouble();
        c = in.nextDouble();
        a = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }

    }
}
