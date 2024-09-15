package house;

import sensors.Sensor;

import java.util.List;

public class House {
    private final String houseId;
    private final List<Sensor> sensors;

    public House( List<Sensor> sensors, String houseId) {
        this.houseId = houseId;
        this.sensors = sensors;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void AddSensor (Sensor sensor) {
        this.sensors.add(sensor);
    }

    public String getHouseId() {
        return houseId;
    }




}
