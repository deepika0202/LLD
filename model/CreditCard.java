package model;

public class CreditCard extends Payment{
    private double parkingRate;
    Vehicle vehicle;
    double serviceRate = 1.5;
   
    public double calculatePrice(Ticket ticket) {
        return parkingRate*1.2*getDuration(ticket);
    }

}
