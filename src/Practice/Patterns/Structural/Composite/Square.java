package Practice.Patterns.Structural.Composite;

public class Square extends CompoundGraphic{
    public int x;
    public int y;

    public Square(int x, int y) {
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
}
