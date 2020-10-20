/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.route;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
class City {
    String name;
    List <Route> routes = new ArrayList <>();
    List <City> city = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, List<City> city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
