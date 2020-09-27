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
class Departament {
    String name;
    String boss;

    public Departament(String name, String boss) {
        this.name = name;
        this.boss = boss;
    }

    @Override
    public String toString() {
        return boss + " is boss in " + name;
    }
    
}
