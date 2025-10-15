package johnatanSSP.inGress.infra.mapper;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.infra.dtos.TicketDto;
import org.springframework.stereotype.Component;

@Component
public class TicketDtoMapper {

    public TicketDto toDto(Ticket ticket){
        return new TicketDto(
                ticket.id(),
                ticket.title(),
                ticket.description(),
                ticket.location(),
                ticket.creator(),
                ticket.category(),
                ticket.startDate(),
                ticket.endDate(),
                ticket.organization(),
                ticket.url(),
                ticket.identify(),
                ticket.image(),
                ticket.status(),
                ticket.rated()
        );
    }

    public Ticket toDomain(TicketDto ticketDto){
        return new Ticket(
                ticketDto.id(),
                ticketDto.title(),
                ticketDto.description(),
                ticketDto.location(),
                ticketDto.creator(),
                ticketDto.category(),
                ticketDto.startDate(),
                ticketDto.endDate(),
                ticketDto.organization(),
                ticketDto.url(),
                ticketDto.identify(),
                ticketDto.image(),
                ticketDto.status(),
                ticketDto.rated()
        );
    }


}
