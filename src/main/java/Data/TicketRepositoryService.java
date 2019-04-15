package Data;

import Models.Ticket;
import Models.User;
import Services.TicketServices;
import Services.UserServices;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

import java.util.Map;

public class TicketRepositoryService implements RepositoryServiceInterface {

    private static final String tableName = "Ticket";

    public Ticket getTicket(String ticketID) {

        Table table = dynamoDB.getTable(tableName);
        Ticket ticket = new Ticket();

        try {

            Item item = table.getItem("ticketID", ticketID);
            Map itemMap = item.asMap();
            System.out.println(item.toJSONPretty());

            ticket = TicketServices.mapToTicket(item.asMap());
            return ticket;
        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            return ticket;
        }

    }

}
