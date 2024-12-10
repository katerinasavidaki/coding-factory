package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = in.next();       // διαβαζει μεχρι(OXI KAI) να βρει whitespace ( spaces, tabs \t, new-lines \n)
        s2 = in.nextLine();   // διαβαζει τα παντα μεχρι να βρει new-line \n . an exoume patisei enter
        // next() : λέξη - λέξη
        //nextLine() : Γραμμή - γραμμή

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
