/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.application;

/**
 *
 * @author Faculty
 */

public class BoxApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox = new Box(20,10,5);
        float volume = mybox.CalculateVolume();
        System.out.println("Volume : " + volume);
    }
    
}
