package ru.svetashov.geometry;

import java.sql.Time;

public class PointsTime extends Points{
    private Time time;

    public PointsTime(int x, Time time) {
        super(x);
        this.time = time;
    }

    public PointsTime(int x, int y, Time time) {
        super(x, y);
        this.time = time;
    }

    public PointsTime(int x, int y, int z, Time time) {
        super(x, y, z);
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Time: " + time;
    }
}
