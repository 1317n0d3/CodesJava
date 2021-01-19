package Practice.Patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observered{
    public int temperature;
    public int presser;
    List<Observer> observers = new ArrayList<>();

    public MeteoStation(int temperature, int presser) {
        this.temperature = temperature;
        this.presser = presser;
    }

    public void setMeteoStation(int temperature, int presser){
        this.temperature = temperature;
        this.presser = presser;
        notifier();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifier() {
        for (Observer observer : observers){
            observer.handleEvent(this.temperature, this.presser);
        }
    }
}
