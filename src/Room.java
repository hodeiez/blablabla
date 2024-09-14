import java.util.List;

public class Room {
    private final List<Sensor> sensors;
    private final String roomName;

    public String getRoomName() {
        return roomName;
    }
    public List<Sensor> getSensors() {
      return sensors;
    }

    public Room(String roomName, List<Sensor> sensors) {
        this.roomName = roomName;
        this.sensors = sensors;
    }

    public void AddSensor (Sensor sensor) {
        this.sensors.add(sensor);
    }

}
