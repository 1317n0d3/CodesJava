package Practice.Patterns.Behavioral.Visitor;

public interface Visitor {
    void visit(Wheel wheel);
    void visit(CarBody carBody);
    void visit(Engine engine);
    void visit(Transmission transmission);
}
