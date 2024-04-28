package model;
//is a relationship thats why used 
public abstract class  Vehicle{
    private String licenseNo;
    public String type;
    public Vehicle(String licenseNo, String type) {
        this.licenseNo = licenseNo;
        this.type = type;
    }
    public String getLicenseNo() {
        return licenseNo;
    }
    
    public abstract boolean assignTicket(Ticket ticket, String type);
}   