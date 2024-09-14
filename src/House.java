import java.util.List;

public class House {
    private final List<Room> rooms;
    private final String houseId;
    public House(List<Room> rooms, String houseId) {
        this.rooms = rooms;
        this.houseId = houseId;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public String getHouseId() {
        return houseId;
    }



}
