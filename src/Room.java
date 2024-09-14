import java.util.List;

public class Room {
    private final List<Door> doors;
    private final String roomName;


    public List<Door> getDoors() {
        return doors;
    }

    public String getRoomName() {
        return roomName;
    }


    public Room(String roomName, List<Door> doors) {
        this.roomName = roomName;
        this.doors = doors;
    }




}
