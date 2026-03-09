package activities;

public class CustomException extends Exception {
    private final String message;

    // Constructor initializes the custom message
    public CustomException(String message) {
        this.message = message;
    }

    // Override getMessage() to return the custom message
    @Override
    public String getMessage() {
        return message;
    }
}