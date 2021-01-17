package Practice.Patterns.Creational.FactoryMethod;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Render HTML button");
    }

    @Override
    public void onClick() {
        System.out.println("Web event has on");
    }
}
