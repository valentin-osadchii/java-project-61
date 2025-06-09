package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class PrimeNumber {
    private static final int PRIME_MAX_SIZE = 100;
    private static final int PRIME_MIN_SIZE = 1;
    private PrimeNumber() {
        throw new IllegalStateException("Utility class");
    }


    static boolean isPrime(int n) {
        int notEvenStart = 3;
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = notEvenStart; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(PRIME_MIN_SIZE, PRIME_MAX_SIZE);

            questionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
            questionsAndAnswers[i][0] = String.valueOf(number);
        }

        String instruction = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.runGame(questionsAndAnswers, instruction);
    }
}
