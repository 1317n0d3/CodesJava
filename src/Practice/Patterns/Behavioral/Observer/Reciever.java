package Practice.Patterns.Behavioral.Observer;

public class Reciever implements Observer{
    @Override
    public void handleEvent(int temperature, int presser) {
        System.out.println("T: " + temperature + " P: " + presser);
    }
}
