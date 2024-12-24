package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter 3 numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.println(findMax(num1, num2, num3));
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a,Math.max(b, c));
    }
}
