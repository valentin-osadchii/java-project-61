package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    private Even() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = (number % 2 == 0) ? "yes" : "no";
        }

        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(questionsAndAnswers, instruction);
    }
}
