package simulation.startMenu;

import field.IslandField;
import simulation.IslandSimulation;

public class Menu {
    private final Parameters parameters;


    public Menu() {
        parameters = new Parameters();
    }

    public void startSimulation() {
        System.out.println("----------------------------------");
        System.out.println("Хотите ли вы внести свои параметры перед началом симуляции?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        System.out.print("Введите номер режима: ");
        int answer = parameters.takeInt(1, 2);

        if (answer == 1) {
            parameters.changeParameters();
        } else {
            IslandField.getInstance().initializeLocations();
            IslandSimulation.getInstance().createIslandModel();
        }
        System.out.println("----------------------------------");
        System.out.println("Загрузка симуляции острова...");
        System.out.println("----------------------------------");
        System.out.println();
    }
}