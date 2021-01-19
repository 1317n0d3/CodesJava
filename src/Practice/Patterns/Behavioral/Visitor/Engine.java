package Practice.Patterns.Behavioral.Visitor;

public class Engine implements CarDetails{
    @Override
    public void except() {
        System.out.println("Engine");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
