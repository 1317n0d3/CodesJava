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
 * @author Admin
 */
class City {
    String name;
    Route [] routes;
    List <Route> route = new ArrayList <>();

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
