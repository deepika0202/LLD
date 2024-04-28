package model;
import java.util.*;

public class Entry {
    public String id;

    public String getId() {
        return id;
    }

    public Entry() {
        id = UUID.randomUUID().toString();
    }
}
