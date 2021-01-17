package Practice.Patterns.Structural.Composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    ArrayList<Graphic> childrens = new ArrayList<>();

    public void add(Graphic children){
        this.childrens.add(children);
    }

    public void remove(Graphic children){
        this.childrens.remove(children);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic children : childrens){
            children.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic children : childrens){
            children.draw();
            children.getCoordinates();
        }
    }

    @Override
    public void getCoordinates() {
        for (Graphic children : childrens){
            children.getCoordinates();
        }
    }
}
