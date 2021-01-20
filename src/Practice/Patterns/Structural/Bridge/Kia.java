package Practice.Patterns.Structural.Bridge;

public class Kia implements Make{
    @Override
    public void getMake() {
        System.out.println("Kia");
    }
}
