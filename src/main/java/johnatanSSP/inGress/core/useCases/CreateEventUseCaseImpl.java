package johnatanSSP.inGress.core.useCases;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.infra.exception.DuplicateEventException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;



public class CreateEventUseCaseImpl implements CreateEventUseCase {

    private final TicketGateway Gateway;

    public CreateEventUseCaseImpl(TicketGateway gateway) {
        this.Gateway = gateway;
    }

    @Override
    public Ticket execute(Ticket ticket) {

        if(Gateway.identifierExists(ticket.identify())){
            throw new DuplicateEventException("o identificador "+ ticket.identify()+ "ja existe no DB");
        }
        String generatedIdentify = ticket.title().toUpperCase().replace(" ","") +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) +
                UUID.randomUUID().toString().toUpperCase().replace("-","").substring(0, 10);

        Ticket newTicket = new Ticket(
                null,
                ticket.title(),
                ticket.description(),
                ticket.location(),
                ticket.creator(),
                ticket.category(),
                ticket.startDate(),
                ticket.endDate(),
                ticket.organization(),
                ticket.url(),
                generatedIdentify,
                ticket.image(),
                ticket.status(),
                ticket.rated()
        );

        return Gateway.CreateTicket(newTicket) ;
    }

}
