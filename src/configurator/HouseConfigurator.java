package configurator;

import house.House;
import sensors.Sensor;
import sensors.SensorMovement;
import sensors.SensorOpenClose;
import sensors.SensorSmoke;

import java.util.List;

public class HouseConfigurator {

    public static House buildHouse(List<Sensor> sensors, String id){
        return new House(sensors,id);
    }
    public static SensorSmoke buildSmokeSensor(boolean activated, boolean detected, String objectId, String objectType, String sensorType, String placedAt) {
        return new SensorSmoke(activated,detected,objectId,false, placedAt);
    }
    public static SensorMovement buildMovementSensor(boolean activated, boolean detected, String objectId, String objectType, String placedAt) {
        return new SensorMovement(activated,detected,objectId,objectType,false, placedAt);
    }
    public static SensorOpenClose buildDoorWindowSensor(String objectId, String objectType, String placedAt) {
        return new SensorOpenClose(objectId,objectType,false, placedAt);
    }

}
