package ru.svetashov.geometry;

import java.util.List;

public class ClosedLine extends BrokenLine implements PolygonalChain{
    public ClosedLine (List<Point> points){
        super(points);
    }

    public int length(){
        int res = super.length();
        if(points.size() < 3) return res;
        return res + (int) Math.sqrt((points.get(points.size() - 1).x - points.get(0).x) * (points.get(points.size() - 1).x - points.get(0).x) + (points.get(points.size() - 1).y - points.get(0).y) * (points.get(points.size() - 1).y - points.get(0).y));
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(super.points);
    }
}
