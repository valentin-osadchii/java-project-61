package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void runGame(String[][] questionsAndAnswers, String instruction) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = "";

        if (scanner.hasNextLine()) {
            userName = scanner.nextLine();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("No input provided. Exiting.");
        }
        // Если есть инструкция — выводим
        if (!instruction.isEmpty()) {
            System.out.println(instruction);
        }

        // Если нет вопросов — завершаем игру
        if (questionsAndAnswers.length == 0) {
            return;
        }

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = questionsAndAnswers[i][0];
            String correctAnswer = questionsAndAnswers[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

