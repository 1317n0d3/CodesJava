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
        this.marks = Arrays.copyOf(marks, marks.length);
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ":" + Arrays.toString(marks);
    }
}
