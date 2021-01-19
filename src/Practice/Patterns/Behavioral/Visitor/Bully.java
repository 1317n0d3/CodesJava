package Practice.Patterns.Behavioral.Visitor;

public class Bully implements Visitor{
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Bully visit wheel");
    }

    @Override
    public void visit(CarBody carBody) {
        System.out.println("Bully visit carBody");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Bully visit engine");
    }

    @Override
    public void visit(Transmission transmission) {
        System.out.println("Bully visit transmission");
    }
}
