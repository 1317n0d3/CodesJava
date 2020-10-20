package ru.svetashov.geometry;

import ru.svetashov.geometry.Figure;
import ru.svetashov.geometry.Point;

public class Circle extends Figure {
    Point centre;
    int radius;

    public Circle(Point centre, int radius) {
        this.centre = centre;
        if (radius < 0) throw new RuntimeException();
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) throw new RuntimeException();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle in point: " + centre + " radius: " + getRadius();
    }
}
