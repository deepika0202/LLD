package model;
import java.util.*;

public abstract class ParkingSpot {
    private String id;
    boolean isAvailable;
    String spotType;
    public ParkingSpot(String type) {
        isAvailable = true;
        id = UUID.randomUUID().toString();
        this.spotType = type;
    }

    public String getSpotid() {
        return this.id;
    }
    public void book() {
        this.isAvailable = false;
    }
}
