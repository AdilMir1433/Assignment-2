package Classes.Components;

import AbstractClasses.CarComponent;

public class Engine {
    private final String componentName;
    public Engine() {
        this.componentName = "Engine";
    }
    public Engine(String name) {
        if(name.isBlank() && name.isEmpty()) name = "Default Engine";
        this.componentName = name;
    }
    @Override
    public String toString() {
        return "Engine: " + componentName;
    }
}