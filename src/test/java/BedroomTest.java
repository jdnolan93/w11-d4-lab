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
    public void doubleHasValue(){
        assertEquals(1, bedroom.getValueFromEnum());
    }
}