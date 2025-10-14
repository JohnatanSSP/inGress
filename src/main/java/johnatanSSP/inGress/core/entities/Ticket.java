package johnatanSSP.inGress.core.entities;

import johnatanSSP.inGress.core.enums.RatedEvent;
import johnatanSSP.inGress.core.enums.StatusTicket;

import java.time.LocalDateTime;

public record Ticket(

        Long id,
        String title,
        String description,
        String location,
        String creator,
        String category,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String organization,
        String url,
        String identify,
        String image,
        StatusTicket status,
        RatedEvent rated
) {

}
