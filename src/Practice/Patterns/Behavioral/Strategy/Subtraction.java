package Practice.Patterns.Behavioral.Strategy;

public class Subtraction implements MathOperation{
    @Override
    public double execute(double x, double y) {
        return x - y;
    }
}
