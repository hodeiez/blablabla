import java.util.List;

public class AlarmOperator implements AlarmChecker{
    List<House> houses;

    public void addHousetoOperator (House house) {
      if(this.houses == null || this.houses.isEmpty()) {
        this.houses = List.of(house);
      }else {
          this.houses.add(house);
      }
    }
    public void activateHouseAllSensors(String selectedHouseId) {
        this.houses.stream().filter(house -> house.getHouseId().equals(selectedHouseId)).findFirst().get().getRooms().forEach(room -> room.getDoors().forEach(door -> door.setActivated(true)));
    }
    public void deActivateHouseAllSensors(String selectedHouseId) {
        this.houses.stream().filter(house -> house.getHouseId().equals(selectedHouseId)).findFirst().get().getRooms().forEach(room -> room.getDoors().forEach(door -> door.setActivated(false)));
    }

    @Override
    public void checkAlarm() {
        this.houses.forEach(house -> {
                house.getRooms().forEach(room ->{
            room.getDoors().forEach(door -> {
                if (door.isDetected()) {
                    System.out.println("Door open at room -> " + room.getRoomName());
                } else {
                    System.out.println("check Alarm");
                }
            });
        });
    });
    }
    @Override
    public void deActivateAll() {
        this.houses.forEach(house -> house.getRooms().forEach(room -> room.getDoors().forEach(door -> door.setActivated(false))));
    }
    @Override
    public void activateAll() {
        this.houses.forEach(house -> house.getRooms().forEach(room -> room.getDoors().forEach(door -> door.setActivated(true))));
    }


}
