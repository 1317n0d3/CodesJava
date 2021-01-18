package Practice.Patterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleIterator<T> implements Iterator {
    public ArrayList<T> object;
    int index = 0;

    public SimpleIterator(ArrayList<T> object) {
        this.object = object;
    }

    @Override
    public boolean hasNext() {
        if (index < object.size()){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        return object.get(index++);
    }

    @Override
    public String toString() {
        return "" + object.get(index-1);
    }
}
