package Practice.Patterns.Behavioral.Visitor;

public class Human implements Visitor{
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Human visit wheel");
    }

    @Override
    public void visit(CarBody carBody) {
        System.out.println("Human visit carBody");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Human visit engine");
    }

    @Override
    public void visit(Transmission transmission) {
        System.out.println("Human visit transmission");
    }
}
