package gr.aueb.cf.ch2;

/**
 * X = 10
 * Y = 85
 * D = 30
 *
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 * Calculates the steps
 */
public class FrogJumpsApp {

    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        // Calculate jumps
        jumps = (int) Math.ceil((target - start) / (double) hop);

        //to ceil kanei strogulopoihsh pros ta panw. thelei double

        System.out.println("Jumps are " + jumps);

        }
    }

