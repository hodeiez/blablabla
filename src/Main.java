import configurator.HouseConfigurator;
import house.House;
import sensors.ObjectType;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        House house = HouseConfigurator.buildHouse(List.of(HouseConfigurator.buildDoorWindowSensor("1", ObjectType.DOOR.toString(), "Redrum")
                ,HouseConfigurator.buildMovementSensor(false,false,"2",ObjectType.ROOM.toString(), "Redrum")),"Böllnas \uD83D\uDE00");

        AlarmOperator operator = new AlarmOperator();
        operator.addHousetoOperator(house);
        operator.activateHouseAllSensors(house.getHouseId());


        int bu = 0;
        while (true) {
            Thread.sleep(1000);
            bu++;
           operator.checkAlarm();
            if (bu == 3) {
                house.getSensors().get(0).setObjectActionated();
            }
            if (bu == 5) {
                house.getSensors().get(1).setObjectActionated();
            }
            if (bu == 6) {
                house.getSensors().get(0).setObjectActionated();
            }
            if (bu == 7){
                operator.deActivateAllSensorsInRoom("Böllnas \uD83D\uDE00","Redrum");
            }




        }
    }
}