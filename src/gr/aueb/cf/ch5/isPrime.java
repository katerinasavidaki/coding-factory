package gr.aueb.cf.ch5;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = 0;

        System.out.println("Enter a number to check if it is prime");
        number = in.nextInt();

        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            } else
                continue;
        }
        return true;
    }
}
