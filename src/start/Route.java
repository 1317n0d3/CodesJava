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
class Route {
    City city;
    int price;

    public Route(City city, int price) {
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return city + " " + price;
    }
    
}
