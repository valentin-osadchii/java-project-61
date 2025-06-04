package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;


public final class Calculator {

    private Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int operation = random.nextInt(3); // +0.5 Для равномерного распределения
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
