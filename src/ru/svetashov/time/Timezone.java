package ru.svetashov.time;

public class Timezone extends Time{
    int utc;
    int utcFlag = 0;

    public Timezone(int sec, int utc){
        super(sec);
        if (utc >= -12 && utc <= 14){
            if (utc < 0) utcFlag = 1;

            this.utc = utc;
        }
        else
            throw new IllegalArgumentException("Wrong utc number");
    }

    public Timezone(int sec, int min, int hour, int utc){
        super(sec, min, hour);
        if (utc >= -12 && utc <= 14){
            if (utc < 0) utcFlag = 1;

            this.utc = utc;
        }
        else
            throw new IllegalArgumentException("Wrong utc number");
    }

    public int getUtc() {
        return utc;
    }

    @Override
    public String toString() {
        if (utcFlag == 0)
            return hour + ":" + min + ":" + sec + " (+" + hour + ":" + min + "UTC)";
        else
            return hour + ":" + min + ":" + sec + " (-" + hour + ":" + min + "UTC)";
    }
}
