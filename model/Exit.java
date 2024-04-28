package model;
import java.util.*;

public class Exit {
    private String exitId;

    public double calculatePrice(Payment payment, Ticket ticket) {
        return payment.calculatePrice(ticket);
    }
    public void setExitId() {
        this.exitId = UUID.randomUUID().toString();
        
    }

    public String getExitId() {
        exitId = UUID.randomUUID().toString();
        return exitId;
    }
    public boolean makePayment(Payment payment, Ticket ticket) {
        double amount = this.calculatePrice(payment, ticket);
        return true;
    }


}
