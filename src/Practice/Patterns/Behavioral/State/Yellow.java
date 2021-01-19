package Practice.Patterns.Behavioral.State;

public class Yellow implements ColorOfTrafficLights{
    @Override
    public void getColor() {
        System.out.println("Yellow");
    }
}
