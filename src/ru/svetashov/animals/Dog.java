package ru.svetashov.animals;

public class Dog implements Woofable{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void woof() {
        System.out.println(name + ": woof!");
    }

    public void woof(int n){
        System.out.println(name + ": woof" + "-woof".repeat(n - 1) + "!");
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}
