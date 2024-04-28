package model;
import java.util.*;

public class Ticket {
    private String ticketNo;
    private int inTime;
    private int endTime;
    ParkingSpot spot;
    List<ParkingSpot> all;

    public Ticket(List<ParkingSpot> allspots){
        this.ticketNo = UUID.randomUUID().toString();
        this.all = allspots;

    }

    public void setTime(int time){
        this.inTime = time;
    }

    public void entTime(int endTime) {
        this.endTime = endTime;
    }
    
    public int getDuration() {
        return this.endTime - this.inTime;
    }

    public String getTicketNumber() {
        return this.ticketNo;
    }

    public ParkingSpot getavailableSpot(String type) {
        for(ParkingSpot spot : all){
            if(spot.spotType == type && spot.isAvailable == true) {
                System.out.println("her");
                this.spot = spot;
                return this.spot;
            }
        }
        

        return null;
    }
}