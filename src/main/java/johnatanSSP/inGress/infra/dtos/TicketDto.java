package johnatanSSP.inGress.infra.dtos;

import johnatanSSP.inGress.core.enums.RatedEvent;
import johnatanSSP.inGress.core.enums.StatusTicket;

import java.time.LocalDateTime;

public record TicketDto(
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
) {}
