package johnatanSSP.inGress.infra.gateway;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.infra.mapper.TicketEntityMapper;
import johnatanSSP.inGress.infra.persistence.TicketEntity;
import johnatanSSP.inGress.infra.persistence.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TicketRepositoryGateway implements TicketGateway {

    private final TicketRepository repository;
    private final TicketEntityMapper mapper;

    @Override
    public Ticket CreateTicket(Ticket ticket) {
        TicketEntity entity = mapper.toEntity(ticket);
        TicketEntity newEntity = repository.save(entity);
        return mapper.toDomain(newEntity);
    }

    @Override
    public List<Ticket> SearchTicket() {
        return repository.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public boolean identifierExists(String identify) {
        return repository.findAll().stream().anyMatch(ticket -> ticket.getIdentify().equalsIgnoreCase(identify));
    }

    @Override
    public Optional<Ticket> FilterTicket(String identify) {
        return repository.findByidentify(identify);
    }
}
