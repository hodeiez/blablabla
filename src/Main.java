import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        House house = new House(List.of(new Room("Redrum",List.of(new Door(false, false)))),"MarkDark");
        AlarmOperator operator = new AlarmOperator();
        operator.addHousetoOperator(house);
        operator.activateHouseAllSensors(house.getHouseId());


        int bu = 0;
        while (true) {
            Thread.sleep(1000);
            bu++;
            house.checkAlarm();
            if (bu == 3) {
                house.getRooms().get(0).getDoors().get(0).setOpen(true);
            }


        }
    }
}