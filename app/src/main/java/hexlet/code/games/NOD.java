package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class NOD {

    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    private NOD() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int b = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

            questionsAndAnswers[i][0] = a + " " + b;
            questionsAndAnswers[i][1] = String.valueOf(gcd(a, b));

        }

        String instruction = "Find the greatest common divisor of given numbers.";
        Engine.runGame(questionsAndAnswers, instruction);
    }

    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        while (true) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            if (a == 0) {
                return b;
            } else if (b == 0) {
                return a;
            }
        }
    }
}
