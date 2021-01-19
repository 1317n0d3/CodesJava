package Practice.Patterns.Behavioral.ObserverExam;

public class Human implements Observer{
    @Override
    public void getPositiveReaction() {
        System.out.println("Human: Урааааааааа");
    }

    @Override
    public void getNegativeReaction() {
        System.out.println("Human: ...");
    }
}
