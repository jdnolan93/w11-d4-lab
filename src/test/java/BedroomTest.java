import Room.Bedroom;
import Room.RoomType;
import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE);
        guest = new Guest("Peter");
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void singleHasValue1(){
        assertEquals(1, bedroom.getValueFromEnum());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void startsWithNoGuests(){
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }
}