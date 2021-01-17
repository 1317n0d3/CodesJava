package Practice.Patterns.Structural.Composite;

public class Circle extends Dot{
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
    }
}
