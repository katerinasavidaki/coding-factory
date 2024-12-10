package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/file7.txt");      // inFd = file descriptor
        // C:\tmp\file7.txt
        File outFd = new File("C:/tmp/file7-out.txt");
        String line;
        String[] tokens;


        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");    // \\s ειναι space -> white space. to + σημαινει ενα η περισσ.τερα

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
