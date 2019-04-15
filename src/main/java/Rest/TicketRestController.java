package Rest;

import Models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {

    @RequestMapping(value = "/getTicket", method = RequestMethod.GET, produces = "application/json")
    public String getUser() {

        System.out.println("User Requested");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            User user = new User();
            return objectMapper.writeValueAsString(user);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }


}
