/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.multiple.students;

/**
 *
 * @author Faculty
 */
public class TestMultipleStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 = new Student("Rashid", "011224022", 0, 0);
        student1.setName("Abdur Rashid");
        
        System.out.println(student1.getName());
        System.out.println("Student 1 CGPA : " + student1.getCgpa());
        student1.updateCgpa(14, 2.4);
        System.out.println("Student 1 CGPA : " + student1.getCgpa());
        
        
        
        Student student2 = new Student("Habib", "011234067", 3.25, 20);
        System.out.println("Student 2 CGPA : " + student2.getCgpa());
        student2.updateCgpa(14, 2.4);
        System.out.println("Student 2 CGPA : " + student2.getCgpa());
        
        Student student3 = student1;
        System.out.println("Student 3 CGPA : " + student3.getCgpa());
        student1 = null;
        System.out.println("Student 1 CGPA : " + student1.getCgpa());
    }
    
}
