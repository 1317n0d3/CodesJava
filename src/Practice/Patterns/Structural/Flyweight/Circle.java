package Practice.Patterns.Structural.Flyweight;

public class Circle implements Shape{
    public int radius = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("Circle in point: " + x + " " + y + " and radius: " + radius);
    }
}
