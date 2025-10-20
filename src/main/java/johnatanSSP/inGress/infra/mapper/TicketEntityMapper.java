package johnatanSSP.inGress.infra.mapper;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.infra.persistence.TicketEntity;
import org.springframework.stereotype.Component;

@Component
public class TicketEntityMapper {

    public TicketEntity toEntity(Ticket ticket){
        return new TicketEntity(
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

    public Ticket toDomain(TicketEntity Entity){
        return new Ticket(
                Entity.getId(),
                Entity.getTitle(),
                Entity.getDescription(),
                Entity.getLocation(),
                Entity.getCreator(),
                Entity.getCategory(),
                Entity.getStartDate(),
                Entity.getEndDate(),
                Entity.getOrganization(),
                Entity.getUrl(),
                Entity.getIdentify(),
                Entity.getImage(),
                Entity.getStatus(),
                Entity.getRated()
        );
    }

}
