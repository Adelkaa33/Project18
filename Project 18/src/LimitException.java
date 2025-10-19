import java.util.Scanner;

// Классы исключений
class LimitException extends RuntimeException {
    private int attempts;

    public LimitException(String message, int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}

class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }
}

