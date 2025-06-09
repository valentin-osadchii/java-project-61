package hexlet.code;

public final class Utils {

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

}
