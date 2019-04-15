package Data;

import Models.User;
import Services.UserServices;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import java.util.Map;

public class UserRepositoryService implements RepositoryServiceInterface{

    private static final String tableName = "User";

    public User getUser(String userID) {
        Table table = dynamoDB.getTable(tableName);
        User user = new User();

        try {

            Item item = table.getItem("userID", userID);
            Map itemMap = item.asMap();
            System.out.println(item.toJSONPretty());

            user = UserServices.mapToUser(item.asMap());
            return user;
        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            return user;
        }

    }

}
