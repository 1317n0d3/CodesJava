package ru.svetashov.geometry;

import java.util.List;

public class ClosedLine extends BrokenLine{
    public ClosedLine (List<Point> points){
        super(points);
    }

    public int length(){
        int res = super.length();
        if(points.size() < 3) return res;
        return res + (int) Math.sqrt((points.get(points.size() - 1).x.doubleValue() - points.get(0).x.doubleValue()) * (points.get(points.size() - 1).x.doubleValue() - points.get(0).x.doubleValue()) + (points.get(points.size() - 1).y.doubleValue() - points.get(0).y.doubleValue()) * (points.get(points.size() - 1).y.doubleValue() - points.get(0).y.doubleValue()));
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(super.points);
    }
}
