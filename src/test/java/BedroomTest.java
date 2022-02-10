import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE);
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
}