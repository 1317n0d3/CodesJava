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
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Student s1 = new Student("Vasya", 5, 3, 2);
//        Student s2 = new Student("Petya", s1.getMarks());
//        System.out.println(s1);
//        System.out.println(s2);
//        
//        int [] marks2 = {2, 2, 2, 3};
//        s2.setMarks(marks2);
//        
//        System.out.println(s1);
//        System.out.println(s2);
        
//        Exams [] ex = {new Exams("Ermakov", "Informatica", 5),
//            new Exams("Petrova", "Math", 5)};
//        RecordBook book = new RecordBook(171896, "Vasya", ex);
//        System.out.println(book);

        City c1 = new City("A");
        City c2 = new City("B");
        City c3 = new City("C");
        Route r1 = new Route(c2, 7);
        Route r2 = new Route(c3, 3);
        Route r3 = new Route(c1, 7);
        
        c1.routes = new Route[]{r1, r2};
        c2.routes = new Route[]{r3, r1};
        
        c1.route.add(r1);
    }
    
}
