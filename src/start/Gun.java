package start;

public class Gun {
    int bullets = 5;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    public void shoot(){
        if (bullets > 0) {
            System.out.println("BAH!");
            bullets--;
        } else
            System.out.println("Bruh");
    }

    @Override
    public String toString() {
        return "Gun{" +
                "bullets=" + bullets +
                '}';
    }
}
