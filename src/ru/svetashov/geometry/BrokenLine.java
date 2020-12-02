package ru.svetashov.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BrokenLine implements Lengthable, PolygonalChain, Moveable {
    List<Point> points = new ArrayList<>();

    public BrokenLine() {
    }

    public BrokenLine(List<Point> points) {
        this.points = points;
    }

    public int length(){
        int length = 0;
        for (int i = 1; i < points.size(); i++){
            length += (points.get(i).x.doubleValue() - points.get(i - 1).x.doubleValue()) * (points.get(i).x.doubleValue() - points.get(i - 1).x.doubleValue()) + (points.get(i).y.doubleValue() - points.get(i - 1).y.doubleValue()) * (points.get(i).y.doubleValue() - points.get(i - 1).y.doubleValue());
        }
        return (int) Math.sqrt(length);
    }

    public void move(int x, int y){
        List<Point> points = new ArrayList<>();
        Point<Integer> point;
        for (int i = 0; i < points.size(); i++){
            point = points.get(i);
            point.setX(point.getX() - x);
            point.setY(point.getY() - y);
        }
        setPoints(points);
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(points);
    }

    public List<Point> getPoints(){
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof BrokenLine)) return false;
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
