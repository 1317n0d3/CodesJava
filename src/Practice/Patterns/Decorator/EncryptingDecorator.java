package Practice.Patterns.Decorator;

public class EncryptingDecorator extends DataSourceDecorator{
    int isEncrypt = 0;

    public EncryptingDecorator(){

    }

    public EncryptingDecorator(DataSource dataSource){
        super(dataSource);
    }

    public String encrypt(String data){
        isEncrypt = 1;
        data = data + "123";
        return data;
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        if(isEncrypt == 1){
            isEncrypt = 0;
            System.out.println("Encrypting data...");
        }
        return super.readData();
    }
}
