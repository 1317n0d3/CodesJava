package start;

import java.util.List;

public class ClosedLine extends BrokenLine {
    public ClosedLine (List<Point> points){
        super(points);
    }
    int lineLength(){
        int res = super.lineLength();
        if(points.size() < 3) return res;
        return res + (int) Math.sqrt((points.get(points.size() - 1).x - points.get(0).x) * (points.get(points.size() - 1).x - points.get(0).x) + (points.get(points.size() - 1).y - points.get(0).y) * (points.get(points.size() - 1).y - points.get(0).y));
    }
}
