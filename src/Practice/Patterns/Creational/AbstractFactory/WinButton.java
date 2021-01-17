package Practice.Patterns.Creational.AbstractFactory;

public class WinButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Windows button on click");
    }
}
