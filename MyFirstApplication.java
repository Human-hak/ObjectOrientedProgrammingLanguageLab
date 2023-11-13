/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.first.application;

/**
 *
 * @author Faculty
 */
public class MyFirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        //10 Times Hello World
        for(int i=0;i<10;i++)
        {
            System.out.println(i + "th");
            System.out.println("Hello World");
        }
        
        int j=0;
        while(j<10)
        {
            System.out.println(j + "th");
            System.out.println("Hello World");
            j++;
        }
    }

}
