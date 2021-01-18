package Practice.Patterns.Behavioral.Iterator;

public class Orc {
    public String name;

    public Orc(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}
