package johnatanSSP.inGress.infra.persistence;

import johnatanSSP.inGress.core.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<TicketEntity,Long> {

    Optional<Ticket> findByidentify(String identify);
}
