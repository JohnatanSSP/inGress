package johnatanSSP.inGress.core.useCases;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.infra.exception.NotFoundEventException;

public class FilterTicketUseCaseImpl implements FilterTicketUseCase {

    private final TicketGateway Gateway;

    public FilterTicketUseCaseImpl(TicketGateway Gateway) {
        this.Gateway = Gateway;
    }

    @Override
    public Ticket execute(String Identify) {
        return Gateway.FilterTicket(Identify).orElseThrow(()-> new NotFoundEventException("Identify: " + Identify + " not found..."));
    }
}
