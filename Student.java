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
public class Student {
    
    //Properties
    private String name;
    public String id;
    private double cgpa;
    public int creditCompleted;
    
    //Constructor
    public Student(String name, String id, double cgpa, int creditCompleted)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.creditCompleted = creditCompleted;
    }
    
    //Getters

    public double getCgpa()
    {
        return cgpa;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    //Setters
    public void setCgpa(double cgpa)
    {
        this.cgpa = cgpa;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Methods
    public void updateCgpa(int credit, double gpa)
    {
        this.cgpa = (this.cgpa*this.creditCompleted + gpa * credit)/(this.creditCompleted + credit);
        this.creditCompleted += credit;
    }
}
