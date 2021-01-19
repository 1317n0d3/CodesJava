package Practice.Patterns.Behavioral.Visitor;

public class Wheel implements CarDetails{
    @Override
    public void except() {
        System.out.println("Wheel");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
