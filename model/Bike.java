package model;

public class Bike extends Vehicle {

    Bike(String licenseNo) {
        super(licenseNo, "Bike");
    }
    public boolean assignTicket(Ticket ticket, String type) {
        
        for(ParkingSpot spot : ticket.all) {
            if(spot.spotType == type && spot.isAvailable == true) {
                spot.isAvailable = false;
                ticket.spot = spot;
                return true;
    
            }
        }
        return false;

    }
    
}
