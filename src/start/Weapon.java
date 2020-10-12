package start;

abstract class Weapon {
    private int ammo;

    public Weapon(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    abstract void shoot();

    public int ammo(){ return ammo; }

    public int getAmmo() {
        if (ammo == 0) return 0;
        ammo--;
        return ammo;
    }

    public void load(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.ammo += ammo;
    }
}
