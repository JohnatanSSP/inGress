package johnatanSSP.inGress.core.useCases;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;

import java.util.List;

public class SearchEventUseCaseImpl implements SearchEventUseCase {

    private TicketGateway Gateway;

    public SearchEventUseCaseImpl(TicketGateway gateway) {
        this.Gateway = gateway;
    }

    @Override
    public List<Ticket> execute() {
        return Gateway.SearchTicket();
    }
}
