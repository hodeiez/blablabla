import configurator.HouseConfigurator;
import gui.Menu;
import house.House;
import operator.AlarmOperator;
import sensors.ObjectType;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

      //build  a house
        House house = HouseConfigurator.buildHouse(List.of(HouseConfigurator.buildDoorWindowSensor("1", ObjectType.DOOR.toString(), "Redrum")
                ,HouseConfigurator.buildMovementSensor(false,false,"2",ObjectType.ROOM.toString(), "Redrum")),"Böllnas \uD83D\uDE00");

        //setup operator
        AlarmOperator operator = new AlarmOperator();
        operator.addHousetoOperator(house);
        operator.activateHouseAllSensors(house.getHouseId());

        //build menu
        Menu menu = new Menu(operator);

        menu.showMainMenu();
        while(true){
            menu.execute();
        }

    }


}