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
class Time {
    int sec;
    private final int min;
    private final int hour;

    public Time(int sec) {
        this.sec = sec;
        
        while(this.sec >= 3600 * 24) this.sec -= 3600 * 24;
        hour = this.sec / 3600;
        min = (this.sec % 3600) / 60;
        this.sec = (this.sec % 3600) % 60;
    }

    @Override
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
    
}
