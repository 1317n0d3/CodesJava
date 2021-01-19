package Practice.Patterns.Behavioral.Visitor;

public interface CarDetails {
    void except();
    void accept(Visitor visitor);
}
