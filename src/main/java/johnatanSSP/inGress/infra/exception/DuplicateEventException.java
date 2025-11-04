package johnatanSSP.inGress.infra.exception;

public class DuplicateEventException extends RuntimeException{
    public DuplicateEventException(String message){
        super(message);
    }
}
