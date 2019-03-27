
package week6;

import java.util.Random;

public class RandGen {
    
    public static void main(String[] args){
        
        final int UPPER_END_OF_RANGE = 100;
        
        Random randGenerator = new Random();
        int randNum = randGenerator.nextInt(UPPER_END_OF_RANGE);
        System.out.println("Random Number: " + randNum);
    } // close main method
} // close class
