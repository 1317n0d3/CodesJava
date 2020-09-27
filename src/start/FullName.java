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
class FullName {
    String surname;
    String name;
    String patronymic;

    public FullName(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if(this.patronymic != null)
            return surname + " " + name + " " + patronymic;
        else if(this.surname != null)
            return surname + " " + name;
        else
            return name;
    }
}
