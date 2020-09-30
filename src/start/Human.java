/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 *
 * @author Admin
 */
class Human {
    FullName name;
    int height;
    Human father;

    public Human(String name, int height){
        this.name = new FullName(name);
        this.height = height;
    }

    public Human(String name, int height, Human father){
        this(name, height);
        this.father = father;
        if(father.name.surname != null) this.name.surname = father.name.surname;
        if(father.name.name != null) this.name.patronymic = father.name.name + "ovich";
    }

    public Human(FullName name, int height) {
        this.name = name;
        this.height = height;
    }
    
    public Human(FullName name, int height, Human father) {
        this(name, height);
        if(father.name.surname != null) this.name.surname = father.name.surname;
        if(father.name.name != null) this.name.patronymic = father.name.name + "ovich";
        this.father = father;
    }
    
    public String heightCategory(){
        if(this.height < 160) return "низкого";
        else if(this.height > 185) return "высокого";
        else return "среднего";
    }
    
    @Override
    public String toString(){
        return name + " (" + height + " см) человек " + heightCategory() + " роста";
    }
}
