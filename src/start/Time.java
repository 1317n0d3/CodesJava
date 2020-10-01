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
    final int min;
    final int hour;

    public Time(int sec) {
        this.sec = sec;
        
        while(this.sec >= 3600 * 24) this.sec -= 3600 * 24;
        hour = this.sec / 3600;
        min = (this.sec % 3600) / 60;
        this.sec = (this.sec % 3600) % 60;
    }

    public Time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int showHour() {
        return hour;
    }

    public int showMin() {
        return min;
    }

    public int showSec() {
        return sec;
    }

    @Override
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
    
}
