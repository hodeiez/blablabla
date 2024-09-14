import java.util.List;

public class House implements AlarmChecker {
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

    @Override
    public void checkAlarm() {
        this.rooms.forEach(room ->{
        room.getDoors().forEach(door -> {
            if (door.isOpen() && door.isActivated) {
                System.out.println("Door open at room -> " + room.getRoomName());
            } else {
                System.out.println("check Alarm");
            }
        });
        });
    }

    @Override
    public void activateAll() {
       this.rooms.forEach(room -> room.getDoors().forEach(door -> door.setActivated(true)));
    }
    @Override
    public void deActivateAll() {
        this.rooms.forEach(room -> room.getDoors().forEach(door -> door.setActivated(false)));
    }
}
