package ru.svetashov.geometry;

import java.util.List;

public class MoveableObjectList implements Moveable{
    List<Moveable> ob;
    MoveableObjectList [] list;

    public MoveableObjectList(List<Moveable> ob) {
        this.ob = ob;
    }

    public MoveableObjectList(MoveableObjectList[] list) {
        this.list = list;
        for (int i = 0; i < this.list.length; i++){

        }
    }

    public void move(int x, int y){
        Moveable object;
        for (int i = 0; i < ob.size(); i++){
            object = ob.get(i);
            object.move(x, y);
        }
    }

    public List<Moveable> getOb() {
        return ob;
    }

    public void setOb(List<Moveable> ob) {
        this.ob = ob;
    }
}
