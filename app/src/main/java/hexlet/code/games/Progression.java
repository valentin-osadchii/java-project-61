package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public final class Progression {
    private static final int PROGRESSION_SIZE = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    static int getElement(int start, int step, int index) {
        int currentElement = start + index * step;
        return currentElement;
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = Utils.getRandomNumber(MIN_START, MAX_START);
            int step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
            int hidingIndex = Utils.getRandomNumber(1, PROGRESSION_SIZE);

            String[] question = new String[PROGRESSION_SIZE];
            for (int j = 0; j < PROGRESSION_SIZE; j++) {
                question[j] = String.valueOf(getElement(start, step, j + 1));
            }

            questionsAndAnswers[i][1] = question[hidingIndex];

            question[hidingIndex] = "..";
            questionsAndAnswers[i][0] = String.join(" ", question);
        }

        String instruction = "What number is missing in the progression?";
        Engine.runGame(questionsAndAnswers, instruction, "Progression");
    }

}
