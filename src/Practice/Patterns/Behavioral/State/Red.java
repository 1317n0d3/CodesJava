package Practice.Patterns.Behavioral.State;

public class Red implements ColorOfTrafficLights{
    @Override
    public void getColor() {
        System.out.println("Red");
    }
}
