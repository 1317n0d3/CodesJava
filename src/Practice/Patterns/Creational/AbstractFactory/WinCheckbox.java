package Practice.Patterns.Creational.AbstractFactory;

public class WinCheckbox implements Checkbox{
    @Override
    public void onClick() {
        System.out.println("Windows checkbox on click!");
    }
}
