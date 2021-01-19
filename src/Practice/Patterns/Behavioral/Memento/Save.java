package Practice.Patterns.Behavioral.Memento;

public class Save {
    private final String level;
    private final int sec;

    public Save(String level, int sec) {
        this.level = level;
        this.sec = sec;
    }

    public String getLevel() {
        return level;
    }

    public int getSec() {
        return sec;
    }
}
