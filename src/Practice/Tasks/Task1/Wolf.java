package Practice.Tasks.Task1;

public class Wolf implements Animal{
    @Override
    public void summerBehavior() {
        System.out.println("Hunt on the animals");
    }

    @Override
    public void winterBehavior() {
        System.out.println("Spend time with other wolfs");
    }
}
