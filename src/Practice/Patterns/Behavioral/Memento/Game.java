package Practice.Patterns.Behavioral.Memento;

public class Game {
    private String level;
    private int sec;

    public void setGame(String level, int sec){
        this.level = level;
        this.sec = sec;
    }

    public Save save(){
        return new Save(level, sec);
    }

    public void load(Save save){
        level = save.getLevel();
        sec = save.getSec();
    }

    @Override
    public String toString() {
        return "level=" + level + '\'' +
                ", sec=" + sec;
    }
}
