package johnatanSSP.inGress.core.gateway;

import johnatanSSP.inGress.core.entities.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketGateway {

    Ticket CreateTicket(Ticket ticket);

    List<Ticket> SearchTicket();

    Optional<Ticket> FilterTicket( String identifier);

    boolean identifierExists(String identifier);
}
