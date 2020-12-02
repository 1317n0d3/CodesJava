/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.people;

/**
 *
 * @author Admin
 */
public class Human {
    private FullName name;
    private int height;
    Human father;

    public Human(String name, int height){
        this.name = new FullName(name);
        if (height < 0 || height > 500)
            throw new IllegalArgumentException("Wrong height");
        this.height = height;
    }

    public Human(String name, int height, Human father){
        this(name, height);
        this.father = father;
        if(father.name.getSurname() != null) this.name.setSurname(father.name.getSurname());
        if(father.name.getName() != null) this.name.setPatronymic(father.name.getName() + "ovich");
    }

    public Human(FullName name, int height) {
        this.name = name;
        this.height = height;
    }
    
    public Human(FullName name, int height, Human father) {
        this(name, height);
        if(father.name.getSurname() != null) this.name.setSurname(father.name.getSurname());
        if(father.name.getName() != null) this.name.setPatronymic(father.name.getName() + "ovich");
        this.father = father;
    }
    
    public String heightCategory(){
        if(this.height < 160) return "низкого";
        else if(this.height > 185) return "высокого";
        else return "среднего";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return name + " (" + height + " см) человек " + heightCategory() + " роста";
    }
}
