import Hotel.Hotel;
import Guest.Guest;
import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;


    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Jamie");
        bedroom = new Bedroom(RoomType.SINGLE);
    }

    @Test
    public void hasTwoConferenceRooms(){
        assertEquals(2, hotel.getConferenceRooms().size());
    }

    @Test
    public void hasTenBedrooms(){
        assertEquals(10, hotel.getBedrooms().size());
    }

    @Test
    public void hasFiveSingleRooms(){
        assertEquals(5, hotel.getSingleRooms().size());
    }

    @Test
    public void hasFiveDoubleRooms(){
        assertEquals(5, hotel.getDoubleRooms().size());
    }

    @Test
    public void hotelCanGetGuestCount(){
        assertEquals(0, hotel.getRoomGuests());
    }

    @Test
    public void hotelCanCheckInGuest(){
        hotel.checkIn(guest, 0);
        assertEquals(1, hotel.getRoomGuests());
    }

    @Test
    public void hotelCanCheckOutGuest(){
        hotel.checkIn(guest, 0);
        hotel.checkIn(guest, 1);
        hotel.checkIn(guest, 2);
        hotel.checkIn(guest, 3);
        hotel.checkOut(guest, 3);
        hotel.getRoomGuests();
        assertEquals(3, hotel.getRoomGuests());
    }
}
