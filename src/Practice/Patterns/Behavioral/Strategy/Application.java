package Practice.Patterns.Behavioral.Strategy;

public class Application {
    MathOperation mathOperation;

    public Application(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculation(double x, double y){
        System.out.println(mathOperation.execute(x, y));
    }
}
