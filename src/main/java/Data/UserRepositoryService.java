package Data;

import Models.User;
import Services.UserServices;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.document.DeleteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;

import java.util.Map;

public class UserRepositoryService implements RepositoryServiceInterface{

    private static final String tableName = "User";

    private Table table;

    public void createUser(User user) {

        table = dynamoDB.getTable(tableName);

        try {

            Item item = new Item().withPrimaryKey("userID", user.getId())
                                    .withString("firstName", user.getFirstName())
                                    .withString("lastName", user.getLastName())
                                    .withString("username", user.getUsername())
                                    .withString("password", user.getPassword());
            table.putItem(item);

        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
        }
    }

    public User getUser(String userID) {

        table = dynamoDB.getTable(tableName);
        User user = new User();

        try {

            Item item = table.getItem("userID", userID);
            Map itemMap = item.asMap();
            System.out.println(item.toJSONPretty());

            user = UserServices.mapToUser(item.asMap());
            return user;
        } catch (AmazonServiceException e) {
            System.out.println("Could not retrieve user with ID: " +userID);
            System.err.println(e.getErrorMessage());
            return user;
        }

    }

    public String getMostRecentUserID() {

        table = dynamoDB.getTable(tableName);

        //query table for most recent user entry

        return "not ready yet :3";

    }

    public String getUserAsJSON(String userID) {

        table = dynamoDB.getTable(tableName);

        try {

            Item item = table.getItem("userID", userID);
            System.out.println(item.toJSONPretty());
            return item.toJSON();

        } catch (AmazonServiceException e) {
            System.out.println("Could not retrieve user with ID: " +userID);
            System.err.println(e.getErrorMessage());
            return "Could not retrieve user with ID: " +userID;
        }

    }

    public void updateUserAddNewAttribute(String userID, String attributeName, String attributeValue) {

        table = dynamoDB.getTable(tableName);

        try {

            UpdateItemSpec updateItemSpec = new UpdateItemSpec().withPrimaryKey("userID", userID)
                    .withUpdateExpression("set #na = :val1").withNameMap(new NameMap().with("#na", attributeName))
                    .withValueMap(new ValueMap().withString(":val1", attributeValue)).withReturnValues(ReturnValue.ALL_NEW);

            UpdateItemOutcome outcome = table.updateItem(updateItemSpec);

            System.out.println("Printing item after adding new attribute...");
            System.out.println(outcome.getItem().toJSONPretty());

        } catch (AmazonServiceException e) {

            System.out.println(e.getErrorMessage());
        }

    }

    public void deleteUser(String userID) {

        table = dynamoDB.getTable(tableName);

        try {
            DeleteItemSpec deleteItemSpec = new DeleteItemSpec().withPrimaryKey("userID", userID).withReturnValues(ReturnValue.ALL_OLD);

            DeleteItemOutcome outcome = table.deleteItem(deleteItemSpec);
            System.out.println("Printing item that was deleted...");
            System.out.println(outcome.getItem().toJSONPretty());
        } catch (AmazonServiceException e) {
            System.err.println("Error deleting user with ID: " + userID);
            System.err.println(e.getErrorMessage());
        }

    }

}
