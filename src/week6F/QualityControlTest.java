
package week6F;

import java.util.Random;

public class QualityControlTest {
    
    public static void main(String[] args){
        
        final int UPPER_END_OF_RANGE = 100;
        int unitTestNum = 0;
        int unitPass = 0;
        int unitFailed = 0;
        
        
        while (unitTestNum < 10) {
            
            Random randGenerator = new Random();
            int randNum = randGenerator.nextInt(UPPER_END_OF_RANGE);
            System.out.println("**Nuclear Quality Test**");
            System.out.println("Unit Quality: " + randNum);
            System.out.println("Test number: " + unitTestNum);
            unitTestNum = unitTestNum + 1;
            
            if(randNum <= 70){
                
                System.out.println("Unit passes quality test");
                unitPass = unitPass + 1;
                System.out.println("Units Passed: " + unitPass + "/" + unitTestNum);
                System.out.println("*************************");
            }else{
                
                System.out.println("Unit failed quality test.");
                unitFailed = unitFailed + 1;
                System.out.println("Units Failed: " + unitFailed + "/" + unitTestNum);
                } // close if/else
        } // close while loop
        System.out.println("Units Accepted: " + unitPass + " Unit Rejected: " + unitFailed);
    } // close main method
} // close class
