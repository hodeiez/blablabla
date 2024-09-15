package house;

import java.util.ArrayList;
import java.util.List;

public class House {
    private final ArrayList<Room> rooms;
    private final String houseId;
    public House(List<Room> rooms, String houseId) {
      this.rooms= new ArrayList<Room>();
        this.rooms.addAll(rooms);
        this.houseId = houseId;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public String getHouseId() {
        return houseId;
    }
    public void addRoom(Room newRoom) {
        this.rooms.add(newRoom);
    }



}
