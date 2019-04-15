package Models;
import java.util.Date;

public class Ticket {

    public Ticket(){

    }

    public Ticket(int ticketID, Date openDate, String name, String contactInfo, String description, int employeeID,
                  int impact, String location, String resolution, int scope, int severity, String status){

        this.ticketID = ticketID;
        this.openDate = openDate;
        this.name = name;
        this.contactInfo = contactInfo;
        this.description = description;
        this.employeeID = employeeID;
        this.impact = impact;
        this.location = location;
        this.resolution = resolution;
        this.scope = scope;
        this.severity = severity;
        this.status = status;
    }

    private int ticketID;
    private Date openDate;
    private String name;
    private String contactInfo;
    private String description;
    private int employeeID;
    private int impact;
    private String location;
    private String resolution;
    private int scope;
    private int severity;
    private String status;

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
