package Test;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(value = "/Employee", method = RequestMethod.GET, produces = "application/json")
    public Employee index() {
        return new Employee(1, "Kyle", "Developer");
    }

}
