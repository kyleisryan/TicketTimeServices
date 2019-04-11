package Rest;

import Models.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserRestController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = "application/json")
    public String getUser() {

        System.out.println("User Requested");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Employee employee = new Employee(1, "Kyle", "Developer");
            return objectMapper.writeValueAsString(employee);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

}
