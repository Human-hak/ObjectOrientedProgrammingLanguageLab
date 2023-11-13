/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number;

/**
 *
 * @author Faculty
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        int i = 2;
        while(count < 20)
        {
            //If i is prime print it
            boolean isPrime = true;
            for(int j=2;j<i;j++)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                }
            }
            
            if(isPrime)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    
}
