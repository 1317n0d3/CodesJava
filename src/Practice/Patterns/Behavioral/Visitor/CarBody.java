package Practice.Patterns.Behavioral.Visitor;

public class CarBody implements CarDetails{
    @Override
    public void except() {
        System.out.println("CarBody");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
