package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public final class Even {

    private Even() {
        throw new IllegalStateException("Utility class");
    }

    public static void even() {
        String userName = Greet.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int winsNeeded = 3;
        Random r = new Random();
        for (int i = 0; i < winsNeeded; i++) {
            int random = r.nextInt(100);
            String even = isEven.test(random) ? "yes" : "no";
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");

            if (scanner.hasNextLine()) {
                String answer = scanner.nextLine();
                if (answer.equals(even)) {
                    System.out.println("Correct!");
                } else {
                    System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", answer, even);
                    System.out.printf("Let's try again, %s!%n", userName);
                    scanner.close();
                    System.exit(0);
                }
            } else {
                System.out.println("No input provided. Exiting.");
            }
        }
        scanner.close();
        System.out.printf("Congratulations, %s%n", userName);

    }

    private static Predicate<Integer> isEven = n -> n % 2 == 0;

}
