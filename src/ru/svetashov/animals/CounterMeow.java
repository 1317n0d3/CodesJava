package ru.svetashov.animals;

public class CounterMeow implements Meowable{
    public int count;
    Meowable cat;

    public CounterMeow(Meowable cat){
        this.cat = cat;
    }

    @Override
    public void meow(){
        count++;
        cat.meow();
    }
}
