package Practice.Patterns.Structural.Bridge;

public class Coupe extends Car{
    public Coupe(Make make) {
        super(make);
    }

    @Override
    public void showType() {
        System.out.println("Coupe");
    }
}
