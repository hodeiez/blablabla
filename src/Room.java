import java.util.List;

public class Room implements Alarm {
    List<Door> doors;
    String roomName;

    public Room(String roomName, List<Door> doors) {
        this.roomName = roomName;
        this.doors = doors;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    @Override
    public void checkAlarm() {

        this.doors.forEach(door -> {
            if (door.isOpen && door.isActivated) {
                System.out.println("Door open at room -> " + this.roomName);
            } else {
                System.out.println("check Alarm");
            }
        });
    }
}
