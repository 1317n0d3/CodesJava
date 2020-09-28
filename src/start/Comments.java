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
    Comments comment;
    int num = 0;

    public Comments(String str, int rate) {
        this.str = str;
        this.rate = rate;
    }

    public Comments(String str, int rate, Comments comment) {
        this.str = str;
        this.rate = rate;
        this.comment = comment;
        this.num = comment.num + 1;
    }

    @Override
    public String toString(){
        if (comment != null)
            return comment + "---".repeat(num) + "(" + rate + ") " + str + "\n" ;
        else
            return "(" + rate + ") " + str + "\n";
    }
    
}
