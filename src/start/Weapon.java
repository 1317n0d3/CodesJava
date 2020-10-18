package start;

abstract class Weapon {
    private int ammo;
    private int maxAmmo;

    public Weapon(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    public Weapon(int ammo, int maxAmmo) {
        this(ammo);
        if (maxAmmo < 0)
            throw new IllegalArgumentException();
        this.maxAmmo = maxAmmo;
    }

    abstract void shoot();

    public int ammo(){ return ammo; }

    public int getAmmo() {
        if (ammo == 0) return 0;
        ammo--;
        return ammo + 1;
    }

    public int letOff(){
        int returnAmmo = ammo;
        ammo = 0;
        return returnAmmo;
    }

    boolean charged(){
        if (ammo > 0)
            return true;
        else
            return false;
    }

    public void load(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.ammo += ammo;
    }
}
