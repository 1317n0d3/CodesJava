package Practice.Patterns.Decorator;

public class FileDataSource implements DataSource{
    String fileName;
    String data;

    public FileDataSource() {
    }

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    public FileDataSource(String fileName, String data) {
        this.fileName = fileName;
        this.data = data;
    }

    void fileDataSource(){
        System.out.println("Source of file: " + fileName);
    }

    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
