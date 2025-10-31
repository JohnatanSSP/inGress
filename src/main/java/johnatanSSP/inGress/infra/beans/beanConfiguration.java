package johnatanSSP.inGress.infra.beans;

import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.core.useCases.CreateEventUseCase;
import johnatanSSP.inGress.core.useCases.CreateEventUseCaseImpl;
import johnatanSSP.inGress.core.useCases.SearchEventUseCase;
import johnatanSSP.inGress.core.useCases.SearchEventUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beanConfiguration {

    @Bean
    public CreateEventUseCase createEvent(TicketGateway Gateway) {
        return new CreateEventUseCaseImpl(Gateway);
    }

    @Bean
    public SearchEventUseCase SearchTicket(TicketGateway Gateway) {return new SearchEventUseCaseImpl(Gateway);}

}
