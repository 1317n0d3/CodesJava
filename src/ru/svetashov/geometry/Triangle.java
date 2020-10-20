package ru.svetashov.geometry;

public class Triangle extends Figure{
    Point vertex1, vertex2, vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public double getArea(){
        Line a = new Line(vertex1, vertex2);
        Line b = new Line(vertex2, vertex3);
        Line c = new Line(vertex3, vertex1);
        int p = (a.length() + b.length() + c.length()) / 2;
        return Math.sqrt(p * (p - a.length()) * (p - b.length()) * (p - c.length()));
    }

    @Override
    public String toString() {
        return "Square in points: " + vertex1 + "\n" + vertex2 + "\n" + vertex3;
    }
}
