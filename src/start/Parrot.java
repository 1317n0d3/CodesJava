package start;

public class Parrot extends Bird {
    String txt;

    public Parrot(String txt) {
        this.txt = txt;
    }

    public void sing(){
        System.out.println(txt);
    }
}
