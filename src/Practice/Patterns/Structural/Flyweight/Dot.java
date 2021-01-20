package Practice.Patterns.Structural.Flyweight;

public class Dot implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.println("Dot in point: " + x + " " + y);
    }
}
