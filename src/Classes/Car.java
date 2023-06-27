package Classes;

import Classes.Components.Door;
import Classes.Components.Engine;
import Classes.Components.Seat;

public class Car {

    private String carName = "Honda";
    private final Seat seat;
    private final Engine engine;
    private final Door door;

    public Car(Seat seat, Engine engine, Door door, String carName) {
        this.seat = seat;
        this.engine = engine;
        this.door = door;
        if(carName.isEmpty()||carName.isBlank()) carName="Default";
        this.carName = carName;
    }
    @Override
    public String toString() {
        return "Car Name : " + carName + "\nDetails : " + seat+ ", " + engine+ ", " + door;
    }

}