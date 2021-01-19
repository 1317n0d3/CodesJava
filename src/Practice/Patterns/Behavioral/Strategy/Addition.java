package Practice.Patterns.Behavioral.Strategy;

public class Addition implements MathOperation{
    @Override
    public double execute(double x, double y) {
        return x + y;
    }
}
