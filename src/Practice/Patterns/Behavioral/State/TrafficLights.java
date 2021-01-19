package Practice.Patterns.Behavioral.State;

public class TrafficLights {
    ColorOfTrafficLights color = new Green();
    boolean isGreen;

    public void nextColor(){
        if (color instanceof Green){
            color = new Yellow();
            isGreen = true;
        } else if ((color instanceof Yellow) && isGreen){
            color = new Red();
        } else if (color instanceof Red){
            color = new Yellow();
            isGreen = false;
        } else if (color instanceof Yellow){
            color = new Green();
        }
    }

    public void getColor(){
        color.getColor();
    }
}
