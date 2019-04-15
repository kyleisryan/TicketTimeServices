package Services;

public class UserServices {

    private int userIDCounter;

    public UserServices() {
        initCounter();
    }

    private void initCounter() {
        userIDCounter = 0; //Replace w/ db call for most recent ticket #
    }

    public int createID() {
        return userIDCounter++;
    }

}
