package johnatanSSP.inGress.infra.beans;

import johnatanSSP.inGress.core.gateway.TicketGateway;
import johnatanSSP.inGress.core.useCases.*;
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

    @Bean
    public FilterTicketUseCase FilterTicket(TicketGateway Gateway) {return new FilterTicketUseCaseImpl(Gateway);}

}
