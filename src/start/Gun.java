package start;

public class Gun extends Weapon{

    public Gun(int ammo){
        super(ammo);
    }

    public Gun(int ammo, int maxAmmo) {
        super(ammo, maxAmmo);
    }

    void shoot(){
        if (getAmmo() > 0) {
            System.out.println("BAH!");
        } else
            System.out.println("Bruh");
    }

    @Override
    public String toString() {
        return "Gun{" +
                "ammo=" + ammo() +
                '}';
    }
}
