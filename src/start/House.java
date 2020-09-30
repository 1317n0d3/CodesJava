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
class House {
    final int floors;

    public House(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        if(floors == 1)
            return "Дом с " + floors + " этажом.";
        else if(floors < 1)
            return "Неправильное количество этажей.";
        return "Дом с " + floors + " этажами.";
    }
}
