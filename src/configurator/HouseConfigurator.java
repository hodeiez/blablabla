package configurator;

import house.House;
import house.Room;
import sensors.Sensor;
import sensors.SensorMovement;
import sensors.SensorOpenClose;
import sensors.SensorSmoke;

import java.util.List;

public class HouseConfigurator {

    public static House buildHouse(List<Room> rooms, String id){
        return new House(rooms,id);
    }
    public static Room buildRoom(String roomName, List<Sensor> sensors) {
        return new Room(roomName, sensors);
    }
    public static SensorSmoke buildSmokeSensor(boolean activated, boolean detected, String objectId, String objectType, String sensorType) {
        return new SensorSmoke(activated,detected,objectId,objectType,sensorType,false);
    }
    public static SensorMovement buildMovementSensor(boolean activated, boolean detected, String objectId, String objectType) {
        return new SensorMovement(activated,detected,objectId,objectType,false);
    }
    public static SensorOpenClose buildDoorWindowSensor(String objectId, String objectType) {
        return new SensorOpenClose(objectId,objectType,false);
    }
    public static SensorSmoke buildSmokeSensor(boolean activated,boolean detected, String objectId, String objectType, String sensorType, boolean smoke ) {
        return new SensorSmoke(activated,detected,objectId,objectType,sensorType,smoke);
    }
}
