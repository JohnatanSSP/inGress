package johnatanSSP.inGress.infra.gateway;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.infra.persistence.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketRepositoryGateway implements TicketGateway {

    private final TicketRepository repository;

    @Override
    public Ticket CreateTicket(Ticket ticket) {
        return repository.save(ticket);
    }
}
