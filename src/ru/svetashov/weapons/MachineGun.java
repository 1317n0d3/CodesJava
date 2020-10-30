package ru.svetashov.weapons;

public class MachineGun extends Gun{
    final int fireRate;

    public MachineGun(){
        super(30, 30);
        this.fireRate = 30;
    }

    public MachineGun(int maxBullets) {
        super(maxBullets, maxBullets);
        this.fireRate = maxBullets / 2;
    }

    public MachineGun(int maxBullets, int fireRate) {
        super(maxBullets, maxBullets);
        if (fireRate < 0)
            throw new IllegalArgumentException("Rate of fire must be positive");
        this.fireRate = fireRate;
    }

    public void shoot(){
        for (int i = 0; i < fireRate; i++) super.shoot();
    }

    public void shoot(int sec){
        for(int i = 0; i < fireRate * sec; i++) super.shoot();
    }
}
