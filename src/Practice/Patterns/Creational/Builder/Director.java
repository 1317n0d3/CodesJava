package Practice.Patterns.Creational.Builder;

public class Director {

    public void makeSportCar(Builder builder){
        builder.setSeats(2);
        builder.setEngine("Engine2xxx8000");
        builder.setTripComputer("88bullshit");
    }
}
