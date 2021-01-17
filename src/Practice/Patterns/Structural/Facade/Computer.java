package Practice.Patterns.Structural.Facade;

public class Computer {
    Power power = new Power();
    UsbDrive usbDrive = new UsbDrive();
    Hdd hdd = new Hdd();

    public void copyUsbDrive(){
        power.on();
        usbDrive.load();
        hdd.copyUsbDrive(usbDrive);
    }
}
