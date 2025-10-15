package johnatanSSP.inGress.infra.presentation;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.infra.dtos.TicketDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class TicketController {

    @PostMapping("createTicket")
    public String createTicket(@RequestBody TicketDto ticket){
        return "ticket";
    }
}
