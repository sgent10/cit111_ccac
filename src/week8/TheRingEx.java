
package week8;

import java.util.Random;

public class TheRingEx {
    
static int numViewersSwallowedByRing = 0;
static string viewer;
public static void main(String[] args) {
        
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
        
        
        System.out.println(viewer + " watched the tape; 7 days to live");

        System.out.println("****************************************");
        checkCopy(viewer);
        
    } // close main
    
    public static void checkCopy(String viewer){
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 5 named " + viewer + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
    } // close checkCopy

} // close class   

