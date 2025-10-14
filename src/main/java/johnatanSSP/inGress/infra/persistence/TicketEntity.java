package johnatanSSP.inGress.infra.persistence;

import jakarta.persistence.*;
import johnatanSSP.inGress.core.enums.RatedEvent;
import johnatanSSP.inGress.core.enums.StatusTicket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "Tickets_DB")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String location;
    private String title;
    private String creator;
    private String category;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String organization;
    private String url;
    private String identify;
    private String image;
    @Enumerated(EnumType.STRING)
    private StatusTicket status;
    @Enumerated(EnumType.STRING)
    private RatedEvent rated;
}
