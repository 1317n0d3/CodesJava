package Practice.Patterns.Behavioral.ObserverExam;

import java.util.ArrayList;
import java.util.List;

public class Moon implements Observered{
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
        if (observer instanceof Human){
            notifierForHumanOnMoon();
        } else {
            notifierForAlienOnMoon();
        }
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifierForHumanOnMoon() {
        for (Observer observer : observers){
            if (observer instanceof Human){
                observer.getPositiveReaction();
            } else {
                observer.getNegativeReaction();
            }
        }
    }

    @Override
    public void notifierForAlienOnMoon() {
        for (Observer observer : observers){
            if (observer instanceof Alien){
                observer.getPositiveReaction();
            } else {
                observer.getNegativeReaction();
            }
        }
    }
}
