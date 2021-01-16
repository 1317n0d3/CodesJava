package Practice.Patterns.Composite;

public class Dot implements Graphic{
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getCoordinates(){
        System.out.println(x + " " + y);
    }

    @Override
    public void draw() {
        System.out.println("Прорисовано");
    }
}
