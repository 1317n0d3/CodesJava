package start;

public class Gun {
    int bullets = 5;
    final int maxBullets;

    public Gun(int bullets, int maxBullets) {
        if (bullets < 0)
            throw new IllegalArgumentException("Wrong bullets number");
        this.bullets = bullets;
        if (maxBullets < 0)
            throw new IllegalArgumentException("Wrong maxBullets number");
        this.maxBullets = maxBullets;
    }

    void shoot(){
        if (bullets > 0) {
            System.out.println("BAH!");
            bullets--;
        } else
            System.out.println("Bruh");
    }

    int reload(int bullets){
        if (bullets < 0)
            throw new IllegalArgumentException("Wrong number of bullets");
        if (bullets > maxBullets){
            this.bullets = maxBullets;
            return bullets - maxBullets;
        } else {
            this.bullets = bullets;
            return 0;
        }
    }

    int letOff(){
        int returnBullets = this.bullets;
        this.bullets = 0;
        return returnBullets;
    }

    boolean charged(){
        if (this.bullets > 0)
            return true;
        else
            return false;
    }

    public int getBullets() {
        return bullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "bullets=" + bullets +
                '}';
    }
}
