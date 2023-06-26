package Classes.Components;

import AbstractClasses.CarComponent;

public class Engine extends CarComponent {
    public Engine() {
        super("Engine"); //default
    }
    public Engine(String name) {
        super(name);
    }
    @Override
    public String getDescription() {
        return "Engine: " + componentName;
    }
}