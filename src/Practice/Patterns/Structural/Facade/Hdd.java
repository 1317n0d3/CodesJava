package Practice.Patterns.Structural.Facade;

public class Hdd {
    public void copyUsbDrive(UsbDrive usbDrive){
        if (usbDrive.isData()){
            System.out.println("Copy information from USB Drive");
        } else {
            System.out.println("Data has not loaded.");
        }
    }
}
