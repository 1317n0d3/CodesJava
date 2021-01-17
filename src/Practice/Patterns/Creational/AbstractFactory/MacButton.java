package Practice.Patterns.Creational.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Mac button on click");
    }
}
