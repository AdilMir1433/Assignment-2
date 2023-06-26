package Classes.Components;

import AbstractClasses.CarComponent;

public class Seat extends CarComponent {
    public Seat() {
        super("Seat"); //default
    }

    public Seat(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Seat: " + componentName;
    }
}
