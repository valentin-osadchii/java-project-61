package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        if (scanner.hasNextLine()) {
            String userName = scanner.nextLine();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("No input provided. Exiting.");
        }
        scanner.close();
    }
}
