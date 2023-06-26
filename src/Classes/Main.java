package Classes;

import Classes.Factory.CarFactory;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();

        Car car1 = carFactory.makeCar("Soft", "1500 CC", "Plastic");
        Car car2 = carFactory.makeCar("Soft", "1500 CC", "Plastic");
        Car car3 = carFactory.makeCar("Hard", "1050 HP", "Metallic");

        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
        System.out.println(car3.getDescription());

        Map<String, Integer> carCounts = carFactory.getCarCounts();
        for (Map.Entry<String, Integer> entry : carCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}