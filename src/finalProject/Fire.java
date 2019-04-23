
package finalProject;



public class Fire {
    
    String name;
    int fuelLevel;
    String color;
    String location;
    boolean burning;
    
    public static void startFire(boolean burning){
        
        System.out.println("Would you like to light the fire? " );
        burning = true;
        
    } // close start fire
    
    public static void burnfuel(int fuelLevel){
        
        fuelLevel = fuelLevel - 2;
        System.out.println("You have lost fuel while the fure continues to burn (-10) " + fuelLevel);
    } // close burnfuel
    
    public static void addFuel(int fuelLevel){
        fuelLevel = fuelLevel + 20;
        fuelLevel = fuelLevel - 2;
        System.out.println("You have lost fuel while the fure continues to burn (-10) " + fuelLevel);
        System.out.println("Current Fuel Level: " + fuelLevel);
    } // close addFuel
    
    public static void cookFood(int fuelLevel){
        fuelLevel = fuelLevel - 22;
    } // close cook food
    
    public static void campsite(String location){
        
        boolean keeplooping = true;
        int cord;
        
        
        while(keeplooping){
        }
    }
            
            
} // close class
