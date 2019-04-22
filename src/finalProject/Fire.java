
package finalProject;



public class Fire {
    
    String name;
    int fuelLevel;
    String color;
    String Location;
    boolean burning;
    
    public static void startFire(boolean burning){
        
        burning = true;
    } // close start fire
    
    public static void burnfuel(int fuelLevel){
        
        fuelLevel = 100;
        System.out.println("You have lost fuel while the fure continues to burn (-10) " + fuelLevel);
        fuelLevel = fuelLevel - 2;
        
    } // close burnfuel
    
    public static void addFuel(int fuelLevel){
        fuelLevel = fuelLevel + 20;
        System.out.println("You have lost fuel while the fure continues to burn (-10) " + fuelLevel);
        fuelLevel = fuelLevel - 2;
    } // close addFuel
    
    public static void cookFood {
        fuelLevel = fuelLevel - 22;
} // close cook food
            
            
} // close class
