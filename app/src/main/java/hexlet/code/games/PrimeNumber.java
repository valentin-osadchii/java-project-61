package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public final class PrimeNumber {
    private static final int PRIME_MAX_SIZE = 100;
    private static final int NOT_EVEN_START = 3;

    private PrimeNumber() {
        throw new IllegalStateException("Utility class");
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = NOT_EVEN_START; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(PRIME_MAX_SIZE);

            questionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
            questionsAndAnswers[i][0] = String.valueOf(number);
        }

        String instruction = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.runGame(questionsAndAnswers, instruction, "Prime");
    }

}
