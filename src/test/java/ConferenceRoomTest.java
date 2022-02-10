import Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(200, "Le Grande");
    }

    @Test
    public void hasName(){
        assertEquals("Le Grande", conferenceRoom.getName());
    }
}
