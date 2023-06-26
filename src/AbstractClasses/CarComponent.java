package AbstractClasses;

public abstract class CarComponent {
    public String componentName;
    public CarComponent(String componentName) {
        this.componentName = componentName;
    }
    public abstract String getDescription();
}
