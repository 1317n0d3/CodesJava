package Practice.Patterns.Creational.Builder;

public class ManualBuilder implements Builder{
    int number;
    String engine;
    String tripComputer;
    String gps;

    @Override
    public void setSeats(int number) {
        this.number = number;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(String gps) {
        this.gps = gps;
    }

    public Manual getResult(){
        return new Manual(this.number, this.engine, this.tripComputer, this.gps);
    }
}
