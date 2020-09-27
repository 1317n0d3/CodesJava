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

    public Human(FullName name, int height) {
        this.name = name;
        this.height = height;
    }
    
    public Human(FullName name, int height, Human father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }
    
    public String heightCategory(){
        if(this.height < 160) return "низкий";
        else if(this.height > 185) return "высокий";
        else return "обычный";
    }
    
    @Override
    public String toString(){
        if(father != null && name.surname == null && name.patronymic == null)
            return name + " " + father.name.surname + " " + father.name.name + "ovich " + heightCategory() + " человек";
        else if(father != null && name.surname == null)
            return name + " " + father.name.surname + " " + heightCategory() + " человек";
        else
            return name + " " + heightCategory() + " человек.";
    }
}
