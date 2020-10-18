package start;

public class Parrot extends Bird{
    String txt;

    public Parrot(String txt) {
        this.txt = txt;
    }

    public StringBuilder changedString(String txt){
        StringBuilder changedTxt = new StringBuilder(txt);
        char buff;
        int numChanges = randomNum(0, txt.length() / 2);
        int pos1 = randomNum(0, txt.length());
        int pos2 = randomNum(0, txt.length());
        for (; numChanges > 0; numChanges--){
            buff = txt.charAt(pos1);
            changedTxt.setCharAt(pos1, txt.charAt(pos2));
            changedTxt.setCharAt(pos2, buff);
        }
        return changedTxt;
    }

    public void sing(){
        System.out.println(changedString(txt));
    }
}
