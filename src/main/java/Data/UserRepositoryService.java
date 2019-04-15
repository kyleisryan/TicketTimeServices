package Data;

import Models.User;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import java.util.Map;

public class UserRepositoryService {

    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    static DynamoDB dynamoDB = new DynamoDB(client);

    private static final String tableName = "User";

    public User getUser(String userID) {
        Table table = dynamoDB.getTable(tableName);
        User user = new User();

        try {

            Item item = table.getItem("userID", userID);
            Map itemMap = item.asMap();
            System.out.println(item.toJSONPretty());

            user.setId(itemMap.get("userID").toString());
            user.setFirstName(itemMap.get("firstName").toString());
            user.setLastName(itemMap.get("lastName").toString());
            user.setUsername(itemMap.get("username").toString());
            user.setPassword(itemMap.get("password").toString());

            return user;
        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            return user;
        }

    }

}
