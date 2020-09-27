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
class People {
    String name;
    private String category = "обычный";
    int height;

    public People(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    public String heightCategory(){
        if(height < 160) category = "низкий";
        else if(height > 185) category = "высокий";
        
        return name + " " + category + " человек";
    }
}
