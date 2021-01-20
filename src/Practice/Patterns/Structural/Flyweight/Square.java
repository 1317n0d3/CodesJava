package Practice.Patterns.Structural.Flyweight;

public class Square implements Shape{
    public int width = 2;
    @Override
    public void draw(int x, int y) {
        System.out.println("Square in point: " + x + " " + y + " and width: " + width);
    }
}
