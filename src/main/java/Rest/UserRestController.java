package Rest;

import Data.UserRepositoryService;
import Models.User;
import Services.UserServices;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

@RestController
public class UserRestController {

    @RequestMapping(value = "/getUser/{userID}", method = RequestMethod.GET, produces = "application/json")
    public String getUserWithID(@PathVariable("userID") String userID) {
        UserRepositoryService userRepo = new UserRepositoryService();
        return userRepo.getUserAsJSON(userID);
    }

    //Change this to POST when implementing the UI
    @RequestMapping(value = "/createUser/{firstName}/{lastName}/{username}/{password}", method = RequestMethod.GET)
    public String createUserWithParams(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName,
                                       @PathVariable("username") String username,
                                       @PathVariable("password") String password) {

        UserRepositoryService userRepo = new UserRepositoryService();
        UserServices userServices = new UserServices();
        User user = new User(userServices.getNewID(), firstName, lastName, username, password);
        userRepo.createUser(user);

        return "Created user with ID: " + user.getId();
    }

    //Change this to POST when implementing the UI
    @RequestMapping(value = "/createUser/{userID}/{firstName}/{lastName}/{username}/{password}", method = RequestMethod.GET)
    public String createUserWithParams(@PathVariable("userID") String userID,
                                       @PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName,
                                       @PathVariable("username") String username,
                                       @PathVariable("password") String password) {

        UserRepositoryService userRepo = new UserRepositoryService();
        User user = new User(userID, firstName, lastName, username, password);
        userRepo.createUser(new User(userID, firstName, lastName, username, password));

        return "Created user with ID: " + user.getId();

    }

    @RequestMapping(value = "/deleteUser/{userID}", method = RequestMethod.GET, produces = "application/json")
    public String deleteUserWithID(@PathVariable("userID") String userID) {
        UserRepositoryService userRepo = new UserRepositoryService();
        userRepo.deleteUser(userID);
        return "Delted user with ID: " + userID;
    }

}
