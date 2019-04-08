
package objects;

/**
 * Client class of our Donut class
 * We make instance of Donut objects
 * and populate their member variables
 * @author sgent10
 */

public class DonutLand {
    
    public static void main(String[] args){
        // make (i.e. "instantiate") a Donut
        // and store a reference to that objext
        // in varible called firstDonut
        // of type Donut
        
        Donut firstDonut = new Donut();
        firstDonut.name = "Henry";
        firstDonut.percRemaining = 100;       
        firstDonut.flavor = "Chocolate Frosted";
        firstDonut.shape = "Round";
        firstDonut.size = "Large";
        firstDonut.hasHole = true;
        // firstDonut should have 90% left
        
        printDonutStatus(firstDonut);
        
        Donut secondDonut = new Donut();
        secondDonut.name = "Homer";
        secondDonut.percRemaining = 100;
        secondDonut.flavor = "Chocolate Frosted";
        secondDonut.size = "Large";
        secondDonut.shape = "Cresent";
        secondDonut.hasHole = true;
        
        secondDonut.eatDonut(15);
        
        printDonutStatus(secondDonut);
        
                
    } // close main
    
    public static void printDonutStatus(Donut d){
        
        int remainingDonut = d.percRemaining;
    
        System.out.println("Percent remaining of" 
        + d.name + " is " + remainingDonut + "%" );
    }
    
    
    
} // close class
