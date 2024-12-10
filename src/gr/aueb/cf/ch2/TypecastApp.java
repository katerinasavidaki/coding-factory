package gr.aueb.cf.ch2;

/**
 * typecast demo.
 */

public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;   // int literals -> stin java einai int ta literals -> 32-bit
        long num2 = 20L;

        num1 = (int) num2;
    }

}
