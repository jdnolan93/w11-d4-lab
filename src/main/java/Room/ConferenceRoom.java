package Room;

public class ConferenceRoom extends Room {

    String name;
    public ConferenceRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
