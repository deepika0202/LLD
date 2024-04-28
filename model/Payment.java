package model;

public abstract class Payment {
    double parkingRate;
    public abstract double calculatePrice(Ticket ticket);

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
