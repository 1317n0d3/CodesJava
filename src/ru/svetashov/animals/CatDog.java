package ru.svetashov.animals;

public class CatDog implements Woofable, Meowable{
    Dog dog;
    Cat cat;

    public CatDog(String name) {
        this.dog = new Dog(name);
        this.cat = new Cat(name);
    }

    public void meow() {
        cat.meow();
    }

    public void meow(int n){
        cat.meow(n);
    }

    public void woof() {
        dog.woof();
    }

    public void woof(int n){
        dog.woof(n);
    }

    public void voice(){
        meow();
        woof();
    }

    public void voice(int n){
        meow(n);
        woof(n);
    }

    @Override
    public String toString() {
        return "CatDog " + dog.name;
    }
}
