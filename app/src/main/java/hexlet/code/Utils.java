package hexlet.code;

public final class Utils {

    private Utils() {
        // Приватный конструктор — чтобы не создавать экземпляры
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

    public static int getRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min must be <= max");
        }

        // Формула: (int)(Math.random() * (max - min + 1)) + min
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int getRandomNumber(int max) {
        int min = 0;
        // Формула: (int)(Math.random() * (max - min + 1)) + min
        return (int) (Math.random() * (max - min + 1));
    }

    public static int findGreatesCommonDivisor(int a, int b) {
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
