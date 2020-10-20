package ru.svetashov.animals;

public class Cuckoo extends Bird{

    public void sing(){
        System.out.println("co-coo ".repeat(randomNum(1, 10)));
    }
}
