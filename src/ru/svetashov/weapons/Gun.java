package ru.svetashov.weapons;

public class Gun extends Weapon{
    private int maxAmmo;

    public Gun(int ammo){
        super(ammo);
    }

    public Gun(int ammo, int maxAmmo) {
        super(ammo, maxAmmo);
    }

    void shoot(){
        if (super.getAmmo() > 0) {
            System.out.println("BAH!");
        } else
            System.out.println("Click");
    }

    @Override
    public String toString() {
        return "Gun{" +
                "ammo=" + super.ammo() +
                '}';
    }
}
