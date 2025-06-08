package hexlet.code;

public final class Utils {

    private Utils() {
        // Приватный конструктор — чтобы не создавать экземпляры
    }

    public static int getRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min must be <= max");
        }

        // Формула: (int)(Math.random() * (max - min + 1)) + min
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
