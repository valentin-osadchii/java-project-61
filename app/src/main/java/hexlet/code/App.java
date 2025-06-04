package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.NOD;
import hexlet.code.games.Greet;
import hexlet.code.games.Progression;
import hexlet.code.games.PrimeNumber;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - Greatest common divisor");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        if (scanner.hasNextInt()) {
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer to avoid /n
            switch (choice) {
                case 1:
                    Greet.run();
                    break;
                case 2:
                    Even.run();
                    break;
                case 3:
                    Calculator.run();
                    break;
                case 4:
                    NOD.run();
                    break;
                case 5:
                    Progression.run();
                    break;
                case 6:
                    PrimeNumber.run();
                    break;
                default:
                    System.out.println("Goodbye");
                    break;
                case 0:
                    System.out.println("Goodbye");
            }
        } else {
            System.out.println("No input provided. Exiting.");
        }
        scanner.close();
    }
}
