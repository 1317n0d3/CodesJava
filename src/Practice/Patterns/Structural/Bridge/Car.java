package Practice.Patterns.Structural.Bridge;

public abstract class Car {
    Make make;

    public Car(Make make) {
        this.make = make;
    }

    public void showDetails(){
        showType();
        make.getMake();
    }

    public abstract void showType();
}
