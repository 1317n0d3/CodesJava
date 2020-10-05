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
    private String name;
    private Departament dep;

    public Employle(String name, Departament dep) {
        this.name = name;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departament getDep() {
        return dep;
    }

    public void setDep(Departament dep) {
        if (this.dep == null)
            this.dep = dep;
        if (this.dep.getBoss() == this)
            this.dep.setBoss(null);
        this.dep = dep;
    }

    @Override
    public String toString() {
        if(this.name == dep.getBoss().name)
            return dep.toString();
        else
            return name + " working in " + dep.getName() + " with boss " + dep.getBoss();
    }
}
