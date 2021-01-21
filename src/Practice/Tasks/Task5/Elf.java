package Practice.Tasks.Task5;

public class Elf implements Unit{
    @Override
    public CloseUnit createCloseUnit() {
        return new ElfCloseUnit();
    }

    @Override
    public DistantUnit createDistantUnit() {
        return new ElfDistantUnit();
    }
}
