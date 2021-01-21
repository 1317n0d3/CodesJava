package Practice.Tasks.Task3;

public abstract class Unit {
    public int hp;
    public int speed;
    public int power;
    public String name;

    public Unit(int hp, int speed, int power) {
        this.hp = hp;
        this.speed = speed;
        this.power = power;

    }

    public int shoot(){
        if (getHp() > 0)
            return this.getPower();
        else
            return 0;
    }

    public void move(){
        if (getHp() > 0)
            System.out.println(getName() + " прошел расстояние " + getSpeed());
    }

    public void getDamage(int damage){
        this.hp -= damage;
        if (getHp() < 0){
            this.hp = 0;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return this.name;
    }
}
