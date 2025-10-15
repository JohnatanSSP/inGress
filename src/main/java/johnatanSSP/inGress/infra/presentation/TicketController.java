package johnatanSSP.inGress.infra.presentation;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.useCases.CreateEventUseCase;
import johnatanSSP.inGress.infra.dtos.TicketDto;
import johnatanSSP.inGress.infra.mapper.TicketDtoMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class TicketController {

    private final CreateEventUseCase createEventUseCase;
    private final TicketDtoMapper ticketDtoMapper;

    public TicketController(CreateEventUseCase createEventUseCase, TicketDtoMapper ticketDtoMapper) {
        this.createEventUseCase = createEventUseCase;
        this.ticketDtoMapper = ticketDtoMapper;
    }

    @PostMapping("createTicket")
    public TicketDto createTicket(@RequestBody TicketDto Dto){
        Ticket ticket = createEventUseCase.execute(ticketDtoMapper.toDomain(Dto));
        return ticketDtoMapper.toDto(ticket);
    };

    @GetMapping
    public String ListTickets(){
        return "listar";
    }
}
