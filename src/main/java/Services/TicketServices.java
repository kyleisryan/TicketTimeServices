package Services;

public class TicketServices implements ServiceInterface{

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

}
