package start;

public class BirdMarket {
    public static void singBirds(Bird...birds){
        for (Bird bird : birds){
            bird.sing();
        }
    }
}
