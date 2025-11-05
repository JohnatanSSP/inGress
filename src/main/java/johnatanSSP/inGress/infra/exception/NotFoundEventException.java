package johnatanSSP.inGress.infra.exception;

public class NotFoundEventException extends RuntimeException {
    public NotFoundEventException(String message) {
        super(message);
    }
}
