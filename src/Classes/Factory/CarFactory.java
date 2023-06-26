package Classes.Factory;

import Classes.Car;
import Classes.Components.Door;
import Classes.Components.Engine;
import Classes.Components.Seat;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static CarFactory instance; //for single object
    private final Map<String, Integer> carCounts;

    private CarFactory() {
        carCounts = new HashMap<>();
    }
    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car makeCar(String seatName, String engineName, String doorName) {
        Engine engine = new Engine(engineName);
        Seat seat = new Seat(seatName);
        Door door = new Door(doorName);

        Car car = new Car(seat, engine, door);

        String carDescription = car.getDescription();
        carCounts.put(carDescription, carCounts.getOrDefault(carDescription, 0) + 1);

        return car;
    }

    public Map<String, Integer> getCarCounts() {
        return carCounts;
    }
}
