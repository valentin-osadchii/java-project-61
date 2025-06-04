package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public final class NOD {

    private NOD() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            Integer a = random.nextInt(100);
            Integer b = random.nextInt(100);

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
