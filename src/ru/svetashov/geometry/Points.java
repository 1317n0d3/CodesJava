package ru.svetashov.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Points {
    List<Integer> coords = new ArrayList<>();

    public Points(int x){
        coords.add(x);
    }

    public Points(int x, int y){
        this(x);
        coords.add(y);
    }

    public Points(int x, int y, int z){
        this(x, y);
        coords.add(z);
    }

    public List<Integer> getCoords() {
        return coords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points = (Points) o;
        return Objects.equals(coords, points.coords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coords);
    }

    @Override
    public String toString() {
        return "Points{" +
                "coords=" + coords +
                '}';
    }
}
