package Rest;

import Models.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {

    @RequestMapping(value = "/getUser2", method = RequestMethod.GET, produces = "application/json")
    public String getUser() {

        System.out.println("User Requested");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Employee employee = new Employee(2, "Zach", "Developer");
            return objectMapper.writeValueAsString(employee);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }


}
