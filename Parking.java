import java.util.*;
import model.*;
public class Parking {

    private int id;
    private String name;
    private String address;

    private HashMap<String, Entry> entrance;
    private HashMap<String, Exit> exitmap;

    private HashMap<String,Ticket> tickets;
    List<ParkingSpot> allspots;
    Parking() {
        this.entrance = new HashMap<String, Entry>();
        this.exitmap = new HashMap<String, Exit>();
        this.tickets = new HashMap<String, Ticket>();
        allspots = new ArrayList<>();
    }
    public boolean addEntrance(Entry entry) {
        entrance.put(entry.getId(), entry);
        return true;
    }

    public boolean addExit(Exit exit) {
        exitmap.put(exit.getExitId(), exit);
        return true;
    }

    public boolean addTicket(Ticket ticket) {
        tickets.put(ticket.getTicketNumber(), ticket);
        return true;
    }

    public static void main(String[] args) {
        Parking parking = new Parking();
        Entry entrance1 = new Entry();
        Entry entrance2 = new Entry();
        Entry entrance3 = new Entry();
        Entry entrance4 = new Entry();

        parking.addEntrance(entrance1);
        parking.addEntrance(entrance2);
        parking.addEntrance(entrance3);
        parking.addEntrance(entrance4);

        Exit exit1 = new Exit();
        Exit exit2 = new Exit();
        Exit exit3 = new Exit();
        Exit exit4 = new Exit();

        parking.addExit(exit1);
        parking.addExit(exit2);
        parking.addExit(exit3);
        parking.addExit(exit4);

        for(int i = 0;i < 2;i++) {
            parking.allspots.add(new Small());
            parking.allspots.add(new Large());

        }

        Car car = new Car("1234");
        Ticket ticket = new Ticket(parking.allspots);
        boolean ans = car.assignTicket(ticket, "Large");
        System.out.println(ans);
        
        Car car2 = new Car("1234");
        Ticket ticket2 = new Ticket(parking.allspots);
        boolean ans2 = car2.assignTicket(ticket2, "Large");
        System.out.println(ans2);

        Car car3 = new Car("1234");
        Ticket ticket3 = new Ticket(parking.allspots);
        boolean ans3 = car3.assignTicket(ticket3, "Large");
        System.out.println(ans3);


        Car car4 = new Car("1234");
        Ticket ticket4 = new Ticket(parking.allspots);
        boolean ans4 = car4.assignTicket(ticket4, "Large");
        System.out.println(ans4);
    }
}
