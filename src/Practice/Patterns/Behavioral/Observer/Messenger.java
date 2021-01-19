package Practice.Patterns.Behavioral.Observer;

public class Messenger implements Observer{
    @Override
    public void handleEvent(int temperature, int presser) {
        System.out.println("Temperature: " + temperature + " Presser: " + presser);
    }
}
