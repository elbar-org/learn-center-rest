package elbar.company.learn_center_rest.exception.exception;

public class InvalidValidationException extends RuntimeException {
    public InvalidValidationException() {
        super();
    }

    public InvalidValidationException(String message) {
        super(message);
    }
}
