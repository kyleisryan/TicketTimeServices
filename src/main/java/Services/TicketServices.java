package Services;

import Models.Ticket;

import java.util.Map;

public class TicketServices extends AbstractService implements ServiceInterface{

    private int ticketIDCounter;

    public TicketServices() {
        initCounter();
    }

    private void initCounter() {
        ticketIDCounter = 0; //Replace w/ db call for most recent ticket #
    }

    public int createID() {
        return ticketIDCounter++;
    }

    public static Ticket mapToTicket(Map<String, Object> map) {
        Ticket ticket = new Ticket();

        ticket.setTicketID(map.get("ticketID").toString());
        ticket.setOpenDate(convertStringToDate(map.get("openDate").toString()));
        ticket.setCloseDate(convertStringToDate(map.get("closeDate").toString()));
        ticket.setCustomerName(map.get("customerName").toString());
        ticket.setCustomerEmail(map.get("customerEmail").toString());
        ticket.setCustomerPhoneNumber(map.get("customerPhoneNumber").toString());
        ticket.setFullDescription(map.get("fullDescription").toString());
        ticket.setShortDescription(map.get("shortDescription").toString());
        ticket.setEmployeeID(map.get("employeeID").toString());
        ticket.setImpact(Integer.parseInt(map.get("impact").toString()));
        ticket.setLocation(map.get("location").toString());
        ticket.setSeverity(Integer.parseInt(map.get("severity").toString()));
        ticket.setScope(Integer.parseInt(map.get("scope").toString()));
        ticket.setStatus(map.get("status").toString());
        ticket.setResolution(map.get("resolution").toString());

        return ticket;
    }

}
