package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * turn lights on, if it is raining
 * AND car is running (speed>100) OR is dark
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        int carSpeed = 0;
        boolean isDark = false;
        boolean isRunning = false;
        boolean lightsOn = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert car carSpeed");
        carSpeed = in.nextInt();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        isRunning = carSpeed > MAX_CAR_SPEED;
        lightsOn = isRaining && ( isDark || isRunning);
        // lightsOn = (isRaining && isDark) || (isRaining && isRunning);

        System.out.println("Turn lights on: " + lightsOn);



    }
}
