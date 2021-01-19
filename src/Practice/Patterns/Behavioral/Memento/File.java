package Practice.Patterns.Behavioral.Memento;

public class File {
    public Save save;

    public File(Save save) {
        this.save = save;
    }

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
