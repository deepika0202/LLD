package model;
import java.util.*;

public class Display {
    HashMap<String, List<ParkingSpot>> available;

    private int id;

    public Display(int id) {
        available = new HashMap<String, List<ParkingSpot>>();
        this.id = id;
    }

    public List<ParkingSpot> addParkingSpot(List<ParkingSpot> spots) {

        for(ParkingSpot spot : spots) {
            if(spot.isAvailable == true) {
                List<ParkingSpot> list = available.get(spot.spotType);
                if(list == null) {
                    list = new ArrayList<>();
                    this.available.put(spot.spotType, new ArrayList<ParkingSpot>());
                } else {
                    this.available.get(spot.spotType).add(spot);
                }
    
            }
        }
        
    }
    public List<ParkingSpot> showEmpty() {
        List<ParkingSpot> empty = new ArrayList<ParkingSpot>();;

        for(Map.Entry<String, List<ParkingSpot>> entry : available.entrySet()) {
            for(ParkingSpot spot : entry.getValue()) {
                if(spot.isAvailable == false) {
                    empty.add(spot);
                }
            }
        }
        return empty;
    }
}
