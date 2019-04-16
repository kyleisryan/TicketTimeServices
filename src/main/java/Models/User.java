package Models;

public class User {

    private String userID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public User() {}

    public User(String id, String firstName, String lastName, String username, String password) {
        this.userID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return this.userID;
    }

    public void setId(String id) {
        this.userID = id;
    }

    public String getFirstName() { return this.firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return this.lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
