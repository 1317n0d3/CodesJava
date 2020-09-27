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
class RecordBook {
    int id;
    String name;
    Exams [] marks;

    public RecordBook(int id, String name, Exams[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ", " + id + ":" + Arrays.toString(marks);
    }
    
}
