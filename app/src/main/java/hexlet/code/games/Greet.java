package hexlet.code.games;

import hexlet.code.Engine;

public final class Greet {

    private Greet() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[0][0];
        String instruction = "";

        Engine.runGame(questionsAndAnswers, instruction);
    }



}
