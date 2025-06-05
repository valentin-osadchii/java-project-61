package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;


public final class Even {
    private static final int MAX_NUMBER = 10;



    private Even() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER);
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = (number % 2 == 0) ? "yes" : "no";
        }

        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(questionsAndAnswers, instruction, "Even");
    }

}
