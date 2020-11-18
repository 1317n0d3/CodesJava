package ru.svetashov.methods;

import java.util.ArrayList;
import java.util.List;

public class Clone implements Cloneable{

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public List<Object> clone(Cloneable...cloneables){
        List<Object> copies = new ArrayList<>();
        for(Cloneable cloneable : cloneables){
//            copies.add(cloneable.clone());
        }
        return copies;
    }
}
