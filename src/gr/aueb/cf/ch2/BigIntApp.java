package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */

public class BigIntApp {

    public static void main(String[] args) {
        // Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("123438548348483");
        BigInteger bigNum2 = new BigInteger("12434354334543543");
        BigInteger result;

        // Commands
        //  %,d (diaxorismos xiliadon)
        result = bigNum1.add(bigNum2);    // .add  leitourgikotita prosthesis aytis tis klasis

        // Printing the results
        System.out.printf("%,d", result);
    }
}
