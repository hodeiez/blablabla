import configurator.HouseConfigurator;
import house.House;
import house.Room;
import sensors.SensorMovement;
import sensors.SensorOpenClose;

import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        House house = new House(List.of(new Room("Redrum",List.of(new SensorOpenClose("1","Door",false),new SensorOpenClose("2","Window",false)))),"MarkDark");

        house.addRoom(new Room("Dionisos", List.of(new SensorMovement(true,false,"3","house.Room",false))));

        AlarmOperator operator = new AlarmOperator();
        operator.addHousetoOperator(house);
        operator.activateHouseAllSensors(house.getHouseId());


        int bu = 0;
        while (true) {
            Thread.sleep(1000);
            bu++;
           operator.checkAlarm();
            if (bu == 3) {
                house.getRooms().get(0).getSensors().get(0).setObjectActionated();
            }
            if (bu == 5) {
                house.getRooms().get(0).getSensors().get(1).setObjectActionated();
            }
            if (bu == 6) {
                house.getRooms().get(1).getSensors().get(0).setObjectActionated();
            }
            if (bu == 7){
                operator.deActivateAllSensorsInRoom("MarkDark","Redrum");
            }




        }
    }
}