/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author светашов_кв
 */
class Departament {
    private String name;
    private Employle boss;
    private List<Employle> empls = new ArrayList<>();

    public Departament(String name, Employle boss) {
        this.name = name;
        this.boss = boss;
    }

    public Employle getBoss() {
        return boss;
    }

    public void setBoss(Employle boss) {
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return boss + " is boss in " + name;
    }
    
}
