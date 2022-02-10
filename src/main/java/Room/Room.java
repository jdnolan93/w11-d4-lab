package Room;

import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }


}
