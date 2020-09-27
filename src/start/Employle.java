/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 *
 * @author светашов_кв
 */
class Employle {
    String name;
    Departament dep;

    public Employle(String name, Departament dep) {
        this.name = name;
        this.dep = dep;
    }

    @Override
    public String toString() {
        if(this.name == dep.boss)
            return dep.toString();
        else
            return name + " working in " + dep.name + " with boss " + dep.boss;
    }
}
