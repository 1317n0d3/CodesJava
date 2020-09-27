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
class Exams {
    String name;
    String teacher;
    int marks;

    public Exams(String name, String teacher, int marks) {
        this.name = name;
        this.teacher = teacher;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\n\t" + name + ", " + teacher + ", " + marks;
    }
    
}
