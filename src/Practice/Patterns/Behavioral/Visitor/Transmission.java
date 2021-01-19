package Practice.Patterns.Behavioral.Visitor;

public class Transmission implements CarDetails{
    @Override
    public void except() {
        System.out.println("Transmission");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
