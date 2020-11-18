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
public class Point <T extends Number> implements Cloneable{
    T x;
    T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object point){
        if(point.equals(this)) return true;
        if(point == null) return false;
        if(point.getClass() != this.getClass()) return false;
        return this.x == ((Point<T>)point).x && this.y == ((Point<T>)point).y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point<T> clone() throws CloneNotSupportedException{
        return (Point<T>) super.clone();
    }
    
    @Override
    public String toString() {
        return "{" + x + ";" + y + '}';
    }
}

