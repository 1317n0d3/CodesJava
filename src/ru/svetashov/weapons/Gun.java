package ru.svetashov.weapons;

public class Gun extends Weapon{
    private int ammo;
    private int maxAmmo;

    public Gun(int ammo){
        super(ammo);
    }

    public Gun(int ammo, int maxAmmo) {
        super(ammo, maxAmmo);
    }

    void shoot(){
        if (this.ammo > 0) {
            System.out.println("BAH!");
            ammo--;
        } else
            System.out.println("Bruh");
    }

    @Override
    public String toString() {
        return "Gun{" +
                "ammo=" + this.ammo +
                '}';
    }
}
