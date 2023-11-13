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
public class Box {

    //Properties
    private float width;
    private float height;
    private float depth;

    //Constructor
    public Box(float width, float height, float depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
    
    //Methods
    public float CalculateVolume()
    {
        return width * height * depth;
    }
}
