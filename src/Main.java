import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Room room = new Room("Redrum",List.of(new Door(true, false)));
        int bu = 0;
        while (true) {
            Thread.sleep(1000);
            bu++;
            room.checkAlarm();
            if (bu == 3) {
                room.doors.get(0).setOpen(true);
            }


        }
    }
}