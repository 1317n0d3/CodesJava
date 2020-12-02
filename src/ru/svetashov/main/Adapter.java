package ru.svetashov.main;

import ru.svetashov.geometry.Lengthable;

public class Adapter extends Number {
    String str;

    Adapter(String str){
        this.str = str;
    }

    public int length(){
        return str.length();
    }

    @Override
    public int intValue(){
        int res = 0;
        for (int i = 0; i < str.length(); i++){
            res += str.charAt(i);
        }
        return res;
    }

    @Override
    public long longValue(){
        return intValue();
    }

    @Override
    public float floatValue(){
        return intValue();
    }

    @Override
    public double doubleValue(){
        return intValue();
    }
}
