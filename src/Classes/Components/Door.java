package Classes.Components;

import AbstractClasses.CarComponent;

public class Door extends CarComponent {
    public Door() {
        super("Door"); //default
    }

    public Door(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Door: " + componentName;
    }
}