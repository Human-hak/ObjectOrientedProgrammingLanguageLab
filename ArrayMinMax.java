/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.min.max;

/**
 *
 * @author Faculty
 */
public class ArrayMinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = {2, 3, 9, 8, 13, 1, 5, 19, 15, 0, 4};
        int min = myArray[0];
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }

}
