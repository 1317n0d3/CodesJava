package Practice.Patterns.Behavioral.ObserverExam;

public class Alien implements Observer{
    @Override
    public void getPositiveReaction() {
        System.out.println("Alien: Ура");
    }

    @Override
    public void getNegativeReaction() {
        System.out.println("Alien: Неееееееееет");
    }
}
