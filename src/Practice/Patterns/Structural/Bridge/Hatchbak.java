package Practice.Patterns.Structural.Bridge;

public class Hatchbak extends Car{
    public Hatchbak(Make make) {
        super(make);
    }

    @Override
    public void showType() {
        System.out.println("Hatchbak");
    }
}
