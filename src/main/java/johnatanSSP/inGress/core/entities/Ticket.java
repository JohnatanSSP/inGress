package johnatanSSP.inGress.core.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

public record Ticket(

        Long id,
        String title,
        String description,
        String location,
        String creator,
        String category,
        LocalDateTime creationDate,
        LocalDateTime updateDate,
        String url,
        String image,
        @Enumerated
        StatusTicket status,
        @Enumerated
        RatedEvent rated
) {

    public enum StatusTicket{
        OPEN, IN_PROGRESS, CLOSED, CANCELED
    }

    public enum RatedEvent {
        BAD, AVERAGE, GOOD, VERY_GOOD, SENSATIONAL
    }

}
