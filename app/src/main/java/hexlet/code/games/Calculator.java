package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public final class Calculator {

    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static final int OPERATION_RANDOMIZER_MIN = 0;
    private static final int OPERATION_RANDOMIZER_MAX = 2;


    private Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int operation = Utils.getRandomNumber(OPERATION_RANDOMIZER_MIN, OPERATION_RANDOMIZER_MAX);
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
