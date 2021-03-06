package Hotel;

import Room.Room;
import Room.Bedroom;
import Room.RoomType;
import Room.ConferenceRoom;
import Guest.Guest;

import java.util.ArrayList;


public class Hotel {
    ArrayList<Bedroom> bedrooms;
    ArrayList<Room> conferenceRooms;

    public Hotel() {

        this.bedrooms = new ArrayList<>();
        this.bedrooms.add(new Bedroom(RoomType.SINGLE));
        this.bedrooms.add(new Bedroom(RoomType.SINGLE));
        this.bedrooms.add(new Bedroom(RoomType.SINGLE));
        this.bedrooms.add(new Bedroom(RoomType.SINGLE));
        this.bedrooms.add(new Bedroom(RoomType.SINGLE));
        this.bedrooms.add(new Bedroom(RoomType.DOUBLE));
        this.bedrooms.add(new Bedroom(RoomType.DOUBLE));
        this.bedrooms.add(new Bedroom(RoomType.DOUBLE));
        this.bedrooms.add(new Bedroom(RoomType.DOUBLE));
        this.bedrooms.add(new Bedroom(RoomType.DOUBLE));
        this.conferenceRooms = new ArrayList<>();
        this.conferenceRooms.add(new ConferenceRoom( 200,"Le Grande"));
        this.conferenceRooms.add(new ConferenceRoom(195,"Le Petite Grande"));
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<Room> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<Room> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getSingleRooms(){
        ArrayList<Bedroom> singlerooms = new ArrayList<>();
        for (Bedroom bedroom: this.bedrooms){
            if (bedroom.getRoomType() == RoomType.SINGLE){
                singlerooms.add(bedroom);
            }
        }
        return singlerooms;
    }

    public ArrayList<Bedroom> getDoubleRooms(){
        ArrayList<Bedroom> doublerooms = new ArrayList<>();
        for (Bedroom bedroom: this.bedrooms){
            if (bedroom.getRoomType() == RoomType.DOUBLE){
                doublerooms.add(bedroom);
            }
        }
        return doublerooms;
    }

    public int getRoomGuests(){
        int roomGuests = 0;
        for (Bedroom bedroom: this.bedrooms){
            if (bedroom.getGuests().size() != 0) {
                roomGuests += bedroom.getGuests().size();
            }

        }
        return roomGuests;
    }

    public void checkIn(Guest guest, int roomNo){
        if (this.bedrooms.get(roomNo).getCapacity() > this.bedrooms.get(roomNo).getGuests().size()){
            this.bedrooms.get(roomNo).addGuest(guest);
        }

    }

    public void checkOut(Guest guest, int roomNo){
        if (this.bedrooms.get(roomNo).getGuests().contains(guest)){
            this.bedrooms.get(roomNo).getGuests().remove(guest);
        }
        else System.out.println("Guest not checked in to this room!");
    }

}
