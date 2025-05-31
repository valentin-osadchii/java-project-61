package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = null;
        if (scanner.hasNextLine()) {
            userName = scanner.nextLine();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("No input provided. Exiting.");
        }
        //scanner.close();
        return userName;
    }



}
