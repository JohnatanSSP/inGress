package johnatanSSP.inGress.core.gateway;

import johnatanSSP.inGress.core.entities.Ticket;

import java.util.List;

public interface TicketGateway {
    Ticket CreateTicket(Ticket ticket);

    List<Ticket> SearchTicket();
}
