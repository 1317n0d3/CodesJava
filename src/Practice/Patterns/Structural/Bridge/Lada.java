package Practice.Patterns.Structural.Bridge;

public class Lada implements Make{
    @Override
    public void getMake() {
        System.out.println("Lada");
    }
}
