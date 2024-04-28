package model;

public class Cash extends Payment{
    private double parkingRate;
    Vehicle vehicle;
   
    public double calculatePrice(Ticket ticket) {
        return parkingRate*getDuration(ticket);
    }

}
