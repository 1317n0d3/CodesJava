package Practice.Patterns.Structural.Facade;

public class UsbDrive {
    private boolean data = false;

    public boolean isData() {
        return data;
    }

    public void load(){
        data = true;
    }

    public void unload(){
        data = false;
    }
}
