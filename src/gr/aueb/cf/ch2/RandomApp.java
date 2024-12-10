package gr.aueb.cf.ch2;

/**
 * Random demo
 */

public class RandomApp {

    public static void main(String[] args) {

        //Dinei enan pseudo tuxaio arithmo apo [0-1)  0-0,99
        // h math random epostrefei double

        int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);

    }
}
