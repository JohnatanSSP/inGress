package johnatanSSP.inGress.core.useCases;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.infra.exception.DuplicateEventException;


public class CreateEventUseCaseImpl implements CreateEventUseCase {

    private final TicketGateway Gateway;

    public CreateEventUseCaseImpl(TicketGateway gateway) {
        this.Gateway = gateway;
    }

    @Override
    public Ticket execute(Ticket ticket) {

        if(Gateway.identifierExists(ticket.identify())){
            throw new DuplicateEventException("o identificador "+ticket.identify()+ "ja existe no DB");
        }

        return Gateway.CreateTicket(ticket) ;
    }

}
