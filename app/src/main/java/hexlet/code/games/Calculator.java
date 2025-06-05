package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;


public final class Calculator {

    private static final int MAX_NUMBER = 100;
    private static final int OPERATION_RANDOMIZER = 3;


    private Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);
            int operation = random.nextInt(OPERATION_RANDOMIZER);
            String operator = "";
            switch (operation) {
                case 0:
                    operator = "+";
                    questionsAndAnswers[i][1] = String.valueOf(number1 + number2);
                    break;
                case 1:
                    operator = "-";
                    questionsAndAnswers[i][1] = String.valueOf(number1 - number2);
                    break;
                case 2:
                    operator = "*";
                    questionsAndAnswers[i][1] = String.valueOf(number1 * number2);
                    break;
                default:
                    System.out.println("Goodbye");
                    break;
            }
            questionsAndAnswers[i][0] = number1 + " " + operator + " " + number2;
        }

        String instruction = "What is the result of the expression?";
        Engine.runGame(questionsAndAnswers, instruction, "Calculator");
    }

}
