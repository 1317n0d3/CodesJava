package Practice.Patterns.Behavioral.Iterator;

import java.util.ArrayList;

public class Class {
    ArrayList<Orc> orcs;

    public Class(ArrayList<Orc> orcs) {
        this.orcs = orcs;
    }

    public void addOrc(Orc orc){
        orcs.add(orc);
    }

    public ArrayList<Orc> getOrcs() {
        return orcs;
    }

    @Override
    public String toString() {
        return orcs.toString();
    }
}
