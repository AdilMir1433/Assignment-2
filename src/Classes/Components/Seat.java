package Classes.Components;

import AbstractClasses.CarComponent;

public class Seat {

    private final String componentName;
    public Seat() {
       this.componentName = "Seat";
    }

    public Seat(String name) {
        if(name.isBlank() && name.isEmpty()) name = "Default Seat";
        this.componentName = name;
    }

    @Override
    public String toString() {
        return "Seat: " + componentName;
    }
}
