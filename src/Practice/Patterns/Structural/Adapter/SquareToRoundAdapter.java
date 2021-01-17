package Practice.Patterns.Structural.Adapter;

public class SquareToRoundAdapter extends RoundPeg{
    SquarePeg squarePeg;

    public SquareToRoundAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        radius = Math.sqrt(2) * squarePeg.getWidth() / 2;
        return radius;
    }
}
