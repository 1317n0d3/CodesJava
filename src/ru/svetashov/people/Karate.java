package ru.svetashov.people;

public class Karate {
    String name;

    public Karate(String name) {
        this.name = name;
    }

    public void kick(){
        System.out.println("kick");
    }

    public void punch(){
        System.out.println("punch");
    }

    public void jumpKick(){
        System.out.println("jumpKick");
    }

    @Override
    public String toString() {
        return "Karate: " + name;
    }
}
