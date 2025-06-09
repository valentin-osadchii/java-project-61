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

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = Utils.getRandomNumber(MIN_START, MAX_START);
            int step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
            int hidingIndex = Utils.getRandomNumber(PROGRESSION_SIZE - 1);

            String[] question = generateProgression(start, step, PROGRESSION_SIZE);

            questionsAndAnswers[i][1] = question[hidingIndex];

            question[hidingIndex] = "..";
            questionsAndAnswers[i][0] = String.join(" ", question);
        }

        String instruction = "What number is missing in the progression?";
        Engine.runGame(questionsAndAnswers, instruction);
    }

    public static String[] generateProgression(int start, int step, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Progression must have at least 1 element, but you have asked for: "
                    + size);
        }
        String[] progression = new String[size];

        for (int j = 0; j < size; j++) {
            progression[j] = String.valueOf(start + j * step);
        }
        return progression;
    }
}
