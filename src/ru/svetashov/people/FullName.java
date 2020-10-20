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
class FullName {
    private String surname;
    private String name;
    private String patronymic;

    public FullName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Input name");
        this.name = name;
    }

    public FullName(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public FullName(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty() || surname == null)
            throw new IllegalArgumentException("Input surname");
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Input name");
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if (patronymic == null || patronymic.isEmpty())
            throw new IllegalArgumentException("Input name");
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if(this.patronymic != null && this.surname != null)
            return surname + " " + name + " " + patronymic;
        else if(this.patronymic != null)
            return name + " " + patronymic;
        else if(this.surname != null)
            return surname + " " + name;
        else
            return name;
    }
}
