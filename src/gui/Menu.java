package gui;

import operator.AlarmOperator;

import java.util.Scanner;

public class Menu {
    Scanner scanner;
    AlarmOperator alarmOperator;

    public Menu( AlarmOperator alarmOperator) {
        this.scanner = new Scanner(System.in);
        this.alarmOperator = alarmOperator;
    }

    public void showMainMenu() {
        System.out.println("\n1.-Get configuration info\n2.-Deactivate everything\n3.-Deactivate a room\n4.-Run simulation");
    }
    public void getConfigurationInfo(String houseId){
        System.out.println(alarmOperator.getHouseInfo(houseId));
    }
    public String getUserInput() {
        return scanner.nextLine();
    }
    public void operate() {
        String userInput = getUserInput();

        switch (userInput) {
            case "1": getConfigurationInfo("Böllnas \uD83D\uDE00"); break;
            case "2": alarmOperator.deActivateAll();break;
            case "3": getDeactivateRoomMenu();break;
            default: showMainMenu();break;

        }
    }

    private void getDeactivateRoomMenu() {
        System.out.println("type in the room you want to deactivate");
        String userInput = getUserInput();
        alarmOperator.deActivateAllSensorsInRoom("Böllnas \uD83D\uDE00",userInput);
        System.out.println("room with id: " + userInput + " has been deactivated");
    }

    public void execute() {
        operate();
        showMainMenu();
    }

}
