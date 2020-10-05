/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
class Student {
    String name;
    private int [] marks;

    public Student(String name, int...marks) {
        this.name = name;
        for (int i:marks){
            if (i > 5 || i < 2)
                throw new IllegalArgumentException("Illegal mark");
        }
        this.marks = Arrays.copyOf(marks, marks.length);
    }

    double averageRate(){
        double rate = 0;
        if (marks.length == 0) return 0;
        else {
            for(int i:marks){
                rate += i;
            }
            rate /= marks.length;
        }
        return rate;
    }

    boolean excellent(){
        int flag = 0;
        for (int i:marks) if (i != 5) flag = 1;
        if (flag == 0) return true;
        else return false;
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public void setMarks(int[] marks) {
        for (int i:marks){
            if (i > 5 || i < 2)
                throw new IllegalArgumentException("Illegal mark");
        }
        this.marks = Arrays.copyOf(marks, marks.length);
    }

    @Override
    public String toString() {
        return name + ":" + Arrays.toString(marks);
    }
}
