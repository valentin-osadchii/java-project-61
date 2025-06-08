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
            Integer a = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            Integer b = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

            questionsAndAnswers[i][0] = a + " " + b;

            if (a.equals(b)) {
                questionsAndAnswers[i][1] = String.valueOf(a);
                continue;
            }

            if (a == 0) {
                questionsAndAnswers[i][1] = String.valueOf(b);
                continue;
            }
            if (b == 0) {
                questionsAndAnswers[i][1] = String.valueOf(a);
                continue;
            }

            while (true) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
                if (a == 0) {
                    questionsAndAnswers[i][1] = String.valueOf(b);
                    break;
                } else if (b == 0) {
                    questionsAndAnswers[i][1] = String.valueOf(a);
                    break;
                }
            }
        }

        String instruction = "Find the greatest common divisor of given numbers.";
        Engine.runGame(questionsAndAnswers, instruction, "Greatest common divisor");
    }

}
