package Rest;

import Data.TicketRepositoryService;
import Models.Ticket;
import Models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {

    @RequestMapping(value = "/getTicket/{tID}", method = RequestMethod.GET, produces = "application/json")
    public String getUser(@PathVariable("tID") String ticketID) {

        TicketRepositoryService ticketRepo = new TicketRepositoryService();

        try {
            Ticket ticket = ticketRepo.getTicket(ticketID);
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(ticket);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }


}
