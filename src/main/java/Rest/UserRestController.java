package Rest;

import Data.UserRepositoryService;
import Models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserRestController {

    @RequestMapping(value = "/getUser/{uID}", method = RequestMethod.GET, produces = "application/json")
    public String getUserWithID(@PathVariable("uID") String userID) {

        UserRepositoryService userService = new UserRepositoryService();

        try {
            User user = userService.getUser(userID);
            ObjectMapper objectMapper = new ObjectMapper();

            return objectMapper.writeValueAsString(user);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

}
