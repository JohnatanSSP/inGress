package johnatanSSP.inGress.core.useCases;

import johnatanSSP.inGress.core.entities.Ticket;
import java.util.List;

public interface SearchEventUseCase {

    public List<Ticket> execute();
}
