package model;

public class DebitCard extends Payment{
    private double parkingRate;
    Vehicle vehicle;
    double serviceRate = 1.2;
   
    public double calculatePrice(Ticket ticket) {
        return parkingRate*1.2*getDuration(ticket);
    }

    public void setParkingRate(Vehicle vehicle) {
        
        if(vehicle instanceof Car) {
            this.parkingRate = 10.0;
        } else if(vehicle instanceof Bike) {
            this.parkingRate = 5.0;
        } else {
            this.parkingRate = 2.0;
        }
    }

    public int getDuration(Ticket ticket) {

        return ticket.getDuration();
    }

}
