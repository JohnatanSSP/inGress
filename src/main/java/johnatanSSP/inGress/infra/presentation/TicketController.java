package johnatanSSP.inGress.infra.presentation;

import johnatanSSP.inGress.core.entities.Ticket;
import johnatanSSP.inGress.core.useCases.CreateEventUseCase;
import johnatanSSP.inGress.core.useCases.SearchEventUseCase;
import johnatanSSP.inGress.infra.dtos.TicketDto;
import johnatanSSP.inGress.infra.mapper.TicketDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class TicketController {

    private final CreateEventUseCase createEventUseCase;
    private final TicketDtoMapper ticketDtoMapper;
    private final SearchEventUseCase searchEventUseCase;

    public TicketController(CreateEventUseCase createEventUseCase, TicketDtoMapper ticketDtoMapper, SearchEventUseCase searchEventUseCase) {
        this.createEventUseCase = createEventUseCase;
        this.ticketDtoMapper = ticketDtoMapper;
        this.searchEventUseCase = searchEventUseCase;
    }

    @PostMapping("createTicket")
    public TicketDto createTicket(@RequestBody TicketDto Dto){
        Ticket ticket = createEventUseCase.execute(ticketDtoMapper.toDomain(Dto));
        return ticketDtoMapper.toDto(ticket);
    };

    @GetMapping("searchTicket")
    public List<TicketDto> SearchTicket(){
        return searchEventUseCase.execute()
                .stream()
                .map(ticketDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
