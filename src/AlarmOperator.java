import house.House;
import sensors.Sensor;

import java.util.List;

public class AlarmOperator {
    List<House> houses;

    public void addHousetoOperator (House house) {
      if(this.houses == null || this.houses.isEmpty()) {
        this.houses = List.of(house);
      }else {
          this.houses.add(house);
      }
    }
    private House getHouse(String selectedHouseId) {
        return this.houses.stream().filter(house -> house.getHouseId().equals(selectedHouseId)).findFirst().get();
    }

    public void activateHouseAllSensors(String selectedHouseId) {
        this.getHouse(selectedHouseId).getSensors().forEach(door -> door.setActivated(true));
    }
    public void deActivateHouseAllSensors(String selectedHouseId) {
       this.getHouse(selectedHouseId).getSensors().forEach(door -> door.setActivated(false));
    }
    public void activateAllSensorsInRoom(String selecteHouseId, String selectedRoom) {
        this.operateAllSensorsInRoom(selecteHouseId,selectedRoom,true);
    }
    public void deActivateAllSensorsInRoom(String selecteHouseId, String selectedRoom) {
        this.operateAllSensorsInRoom(selecteHouseId,selectedRoom,false);
    }
   private void operateAllSensorsInRoom(String selecteHouseId, String selectedRoom, boolean activate) {
       this.getSensorAtPlace(selecteHouseId,selectedRoom).forEach(s -> s.setActivated(activate));
    }

    public  List<Sensor> getSensorAtPlace(String selectedHouseId, String selectedRoom) {
       return this.getHouse(selectedHouseId).getSensors().stream().filter(s -> s.getPlacedAt().equals(selectedRoom)).toList();
    }

    public void checkAlarm() {
        this.houses.forEach(house -> {
                house.getSensors().forEach(sensor -> {
                if (sensor.isDetected()) {
                    System.out.println( sensor.getIdentification() + " activated by " + sensor.getSensorType() + " at "+ house.getHouseId() + " house in room -> " + sensor.getPlacedAt());
                } else {
                    System.out.println("check Alarm for " + sensor.getIdentification());
                }
            });
        });;
    }

    public void deActivateAll() {
        this.houses.forEach(house -> house.getSensors().forEach(door -> door.setActivated(false)));
    }

    public void activateAll() {
        this.houses.forEach(house -> house.getSensors().forEach(door -> door.setActivated(true)));
    }


}
