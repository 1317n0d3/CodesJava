package ru.svetashov.weapons;

public class BestShooter {
    private String name;
    private Gun gun;

    public BestShooter(String name) {
        this.name = name;
    }

    public BestShooter(String name, Gun gun) {
        this.name = name;
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void shoot(){
        if (gun == null) System.out.println("I can't take part");
        else gun.shoot();
    }
}
