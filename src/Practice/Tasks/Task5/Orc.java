package Practice.Tasks.Task5;

public class Orc implements Unit{
    @Override
    public CloseUnit createCloseUnit() {
        return new OrcCloseUnit();
    }

    @Override
    public DistantUnit createDistantUnit() {
        return new OrcDistantUnit();
    }
}
