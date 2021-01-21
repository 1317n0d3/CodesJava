package Practice.Tasks.Task1;

public class Sheep implements Animal{
    @Override
    public void summerBehavior() {
        System.out.println("Eat green grass");
    }

    @Override
    public void winterBehavior() {
        System.out.println("Hide in home");
    }
}
