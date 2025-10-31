package johnatanSSP.inGress.core.useCases;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.infra.persistence.TicketRepository;
import org.springframework.stereotype.Service;


public class CreateEventUseCaseImpl implements CreateEventUseCase {

    private final TicketGateway Gateway;

    public CreateEventUseCaseImpl(TicketGateway gateway) {
        this.Gateway = gateway;
    }

    @Override
    public Ticket execute(Ticket ticket) {
        return Gateway.CreateTicket(ticket) ;
    }

}
