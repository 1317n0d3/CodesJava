package ru.svetashov.animals;

public abstract class Bird{
    public abstract void sing();

    public int randomNum(int a, int b){
        return (int)(Math.random() * (b - a)) + a;
    }
}