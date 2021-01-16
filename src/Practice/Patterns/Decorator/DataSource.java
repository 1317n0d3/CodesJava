package Practice.Patterns.Decorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}
