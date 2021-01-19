package Practice.Patterns.Behavioral.State;

public class Green implements ColorOfTrafficLights{
    @Override
    public void getColor() {
        System.out.println("Green");
    }
}
