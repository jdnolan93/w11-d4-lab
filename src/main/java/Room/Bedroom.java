package Room;
public class Bedroom extends Room{

    RoomType roomType;

    public Bedroom(RoomType roomType) {
        super(roomType.getValue());
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }
}
