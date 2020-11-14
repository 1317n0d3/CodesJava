/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.route;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class City {
    String name;
    List <Route> routes = new ArrayList <>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, List<Route> routes) {
        this.name = name;
        this.routes = List.copyOf(routes);
        addRoutes(routes);
    }

    public List<Route> getRoutes() {
        return List.copyOf(routes);
    }

    public void addRoutes(List<Route> routes) {
        for (int i = 0; i < routes.size(); i++) addRoute(routes.get(i));
    }

    public void addRoute (City city, int price, boolean flag){
        if (cityCheck(city) == false)
            throw new IllegalArgumentException();
        if (flag == true) {
            this.routes.add(new Route(city, price));
            city.addRoute(this, price);
        }
        else {
            this.routes.add(new Route(city, price));
        }
    }

    public void addRoute (Route route){
        if (cityCheck(route.city) == false)
            throw new IllegalArgumentException();
        this.routes.add(new Route(route.city, route.price));
    }

    public void addRoute (City city, int price){
        if (cityCheck(city) == false)
            throw new IllegalArgumentException();
        this.routes.add(new Route(city, price));
    }

    public void removeRoute (Route route){
        this.routes.remove(route);
    }

    public boolean cityCheck (City city){
        for (Route route : routes) {
            if (route.city == city)
                return false;
        }
        return true;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = List.copyOf(routes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) &&
                Objects.equals(routes, city.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, routes);
    }

    @Override
    public String toString() {
        return name;
    }
    
}