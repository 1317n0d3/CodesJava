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
class Comments {
    String str;
    int rate;

    public Comments(String str, int rate) {
        this.str = str;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "(" + rate + ")" + str;
    }
    
}
