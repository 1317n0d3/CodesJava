/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.publication;

/**
 *
 * @author Admin
 */
class Comments {
    String str;
    int rate;
    int rateFlag = 0;
    Comments comment;
    int num = 0;

    public Comments(String str, int rate) {
        this.str = str;
        this.rate = rate;
        this.rateFlag = 1;
    }

    public Comments(String str, int rate, Comments comment) {
        this.str = str;
        this.rate = rate;
        this.comment = comment;
        this.num = comment.num + 1;
        this.rateFlag = 1;
    }

    void rateUp(){
        this.rate++;
    }

    void rateDown(){
            this.rate--;
    }

    void canChange() {
        if (rateFlag == 0)
            System.out.println("You can change comments");
        else
            System.out.println("You can not change parametres");
    }

    public void setComment(String str) {
        if (rateFlag == 1)
            throw new IllegalArgumentException("Editing impossible");
        this.str = str;
    }

    @Override
    public String toString(){
        if (comment != null)
            return comment + "---".repeat(num) + "(" + rate + ") " + str + "\n" ;
        else
            return "(" + rate + ") " + str + "\n";
    }
    
}
