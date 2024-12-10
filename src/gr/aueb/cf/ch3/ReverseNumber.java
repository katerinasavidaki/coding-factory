package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Antistrefei enan akeraio px 123 ginetai 321
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int tempNum = inputNum;
        int rightDigit = 0;

        System.out.println("Enter a positive number");
        inputNum = in.nextInt();

        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;   // tempNum = tempNum / 10

        }

        System.out.println("The reversed number is " + reversed);
    }
}
