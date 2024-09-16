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
        switch (getUserInput()) {
            case "1": getConfigurationInfo("Böllnas \uD83D\uDE00");
            case "2": alarmOperator.deActivateAll();
            default: showMainMenu();
        }
    }
    public void execute() {
        operate();
    }

}
