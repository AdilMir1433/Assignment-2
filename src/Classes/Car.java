package Classes;

import Classes.Components.Door;
import Classes.Components.Engine;
import Classes.Components.Seat;

public class Car {
    private Seat seat;
    private Engine engine;
    private Door door;

    public Car(Seat seat, Engine engine, Door door) {
        this.seat = seat;
        this.engine = engine;
        this.door = door;
    }

    public String getDescription() {
        return seat.getDescription() + ", " + engine.getDescription() + ", " + door.getDescription();
    }
}