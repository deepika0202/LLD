package model;

public class Car extends Vehicle {
  
   public  Car(String licenseNo) {
        super(licenseNo, "Car");
    }
    

    public boolean assignTicket(Ticket ticket, String type) {
        ParkingSpot spot = ticket.getavailableSpot(type);
        
        if(spot != null) {
            spot.book();
            return true;
        }
        return false;

    }
}
