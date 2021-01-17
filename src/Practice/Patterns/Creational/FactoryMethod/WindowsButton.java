package Practice.Patterns.Creational.FactoryMethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows event has on");
    }
}
