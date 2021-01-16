package Practice.Patterns.Adapter;

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
