package Services;

import Models.User;

import java.util.Map;

public class UserServices extends AbstractService implements ServiceInterface {

    private String userIDCounter;

    public UserServices() {
        initCounter();
    }

    private void initCounter() {
        userIDCounter = getNewID(); //Replace w/ db call for most recent ticket #
    }

    public String getNewID() {
        //instantiate repo
        //return repo.getMostRecentUserID();
        return "u" + 1;
    }

    public static User mapToUser(Map<String, Object> map) {
        User user = new User();

        user.setId(map.get("userID").toString());
        user.setFirstName(map.get("firstName").toString());
        user.setLastName(map.get("lastName").toString());
        user.setUsername(map.get("username").toString());
        user.setPassword(map.get("password").toString());

        return user;
    }

}
