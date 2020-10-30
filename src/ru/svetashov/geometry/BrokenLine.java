package ru.svetashov.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BrokenLine implements Lengthable, PolygonalChain {
    List<Point> points = new ArrayList<>();

    public BrokenLine() {
    }

    public BrokenLine(List<Point> points) {
        this.points = points;
    }

    public int length(){
        int length = 0;
        for (int i = 1; i < points.size(); i++){
            length += (points.get(i).x - points.get(i - 1).x) * (points.get(i).x - points.get(i - 1).x) + (points.get(i).y - points.get(i - 1).y) * (points.get(i).y - points.get(i - 1).y);
        }
        return (int) Math.sqrt(length);
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(points);
    }

    public List<Point> getPoints(){
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine that = (BrokenLine) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return "Line" + points;
    }
}
