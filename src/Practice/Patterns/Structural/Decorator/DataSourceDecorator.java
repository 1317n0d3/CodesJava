package Practice.Patterns.Structural.Decorator;

public class DataSourceDecorator implements DataSource{
    DataSource dataSource;

    public DataSourceDecorator() {
    }

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
