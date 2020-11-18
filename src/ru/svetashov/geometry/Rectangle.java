package ru.svetashov.geometry;

import java.util.ArrayList;
import java.util.List;

public class Rectangle<T extends Number> extends Square implements PolygonalChain{
    private int length;

    public Rectangle(Point leftTop, int width, int length){
        super(leftTop, width);
        if(length < 0) throw new RuntimeException();
        this.length = length;
    }

    public double getArea(){ return getWidth() * this.length; }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length < 0) throw new RuntimeException();
        this.length = length;
    }

    public BrokenLine getBrokenLine(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(leftTop.x, leftTop.y));
        points.add(new Point(leftTop.x.doubleValue() + getWidth(), leftTop.y));
        points.add(new Point(leftTop.x.doubleValue() + getWidth(), leftTop.y.doubleValue() - getLength()));
        points.add(new Point(leftTop.x, leftTop.y.doubleValue() - getLength()));
        BrokenLine line = new BrokenLine(points);
        return line;
    }

    @Override
    public String toString() {
        return "Rectangle in point: " + leftTop + " width: " + getWidth() + " length: " + getLength();
    }
}
