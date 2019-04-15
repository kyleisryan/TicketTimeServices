package Models;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Ticket {

    private String ticketID;
    private Date openDate;
    private Date closeDate;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private String fullDescription;
    private String shortDescription;
    private String employeeID;
    private int impact;
    private String location;
    private String resolution;
    private int scope;
    private int severity;
    private String status;

    public Ticket(){}

    public Ticket(String ticketID, Date openDate, Date closeDate, String customerName, String customerEmail, String phoneNumber,
                  String shortDescription, String fullDescription, String employeeID, int impact, String location, String resolution,
                  int scope, int severity, String status) {

        this.ticketID = ticketID;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = phoneNumber;
        this.fullDescription = fullDescription;
        this.shortDescription = shortDescription;
        this.employeeID = employeeID;
        this.impact = impact;
        this.location = location;
        this.resolution = resolution;
        this.scope = scope;
        this.severity = severity;
        this.status = status;
    }

    public String getTicketID() { return this.ticketID; }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public Date getOpenDate() {
        return this.openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() { return this.closeDate; }

    public void setCloseDate(Date closeDate) { this.closeDate = closeDate; }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getFullDescription() {
        return this.fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
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
