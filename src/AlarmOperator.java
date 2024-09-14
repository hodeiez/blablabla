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
    public void activateHouseAllSensors(String selectedHouseId) {
        this.houses.stream().filter(house -> house.getHouseId().equals(selectedHouseId)).findFirst().get().activateAll();
    }
    public void deActivateHouseAllSensors(String selectedHouseId) {
        this.houses.stream().filter(house -> house.getHouseId().equals(selectedHouseId)).findFirst().get().deActivateAll();
    }
}
