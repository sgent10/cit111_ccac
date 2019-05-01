
package objects;



public class Donut {
    // Member vaiables
    // each instance of a donut class
    // will receive each of these member varibles
    // and can customize theirs values
    
    String name;
    int percRemaining;
    String size;
    String flavor;
    String shape;
    boolean hasHole;
    
    /**
     * Simulates eating some prevent of this
     * donut
     * @param percentEaten 
     */
    
    public void eatDonut(int percentEaten){
        
        percRemaining = percRemaining - percentEaten;
        
    } // close eatDonut
    
    /**
     * Accessor method for retrieving the value
     * of the member variable percRemaining
     * 
     * @return 
     */
    
    public int getPercentRemaining(){
        return percRemaining;
        
    } // close getPercentRemaining
    

} // close class

