package Classes.Components;

import AbstractClasses.CarComponent;

public class Door{

    private final String componentName;
    public Door() {
        this.componentName = "Door";
    }

    public Door(String name) {
        if(name.isBlank() && name.isEmpty()) name = "Default Door";
        this.componentName = name;
    }

    @Override
    public String toString() {
        return "Door: " + componentName;
    }
}