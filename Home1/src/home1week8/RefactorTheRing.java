
package week8;

import java.util.Random;

public class RefactorTheRing {
    // chop main up and call the new methods as needed
    
    
    public static int numViewersSwallowedByRing = 0;
    int viewerNum = 0;
    public static void main(String[] args) {
        
       
        
        viewer1 = "Katie";
        viewer2 = "Josh";
        viewer3 = "Rachel";
        viewer4 = "Noah";
        viewer5 = "Aiden";
        
        System.out.println(viewer + " watched the tape; 7 days to live");
    
        
    } // close main
    public static int watchFilm(int viewerNum){
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 1 named " + viewer + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
    }    
       
    }     
    
    // write and test your new methods here
    
} // close class
