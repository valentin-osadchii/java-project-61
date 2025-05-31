package hexlet.code;

import java.util.Scanner;

public final class Greet {

    private Greet() {
        throw new IllegalStateException("Utility class");
    }


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
        return userName;
    }



}
