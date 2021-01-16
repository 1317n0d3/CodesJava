package Practice.Patterns.Decorator;

import javax.xml.crypto.Data;

public class CompressionDecorator extends DataSourceDecorator{
    int isPack = 0;

    public CompressionDecorator(){

    }

    public CompressionDecorator(DataSource dataSource){
        super(dataSource);
    }

    public String pack(String data){
        isPack = 1;
        return "Packing data... " + data;
    }

    @Override
    public void writeData(String data) {
        super.writeData(pack(data));
    }

    @Override
    public String readData() {
        if(isPack == 1){
            isPack = 0;
            System.out.println("UnPacking data...");
        }
        return super.readData();
    }
}
