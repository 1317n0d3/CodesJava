package Practice.Tasks.Task1;

public class Rabbit implements Animal{
    @Override
    public void summerBehavior() {
        System.out.println("Eat grass");
    }

    @Override
    public void winterBehavior() {
        System.out.println("Hide in winter forest");
    }
}
