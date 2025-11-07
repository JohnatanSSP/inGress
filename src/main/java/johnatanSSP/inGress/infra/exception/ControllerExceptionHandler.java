package johnatanSSP.inGress.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(DuplicateEventException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateTicketExceptions(DuplicateEventException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("status: ", exception.getMessage());
        response.put("message", "please try again, insert a valid number identify for your ticket");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundEventException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateTicketExceptions(NotFoundEventException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("status: ", exception.getMessage());
        response.put("message", "The request Ticket was not found, check the identify and try again");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

}
