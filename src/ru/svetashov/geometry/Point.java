/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.geometry;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object point){
        if(point == this) return true;
        if(point == null) return false;
        if(point.getClass() != this.getClass()) return false;
        return this.x == ((Point)point).x && this.y == ((Point)point).y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException{
        return (Point) super.clone();
    }
    
    @Override
    public String toString() {
        return "{" + x + ";" + y + '}';
    }
}

