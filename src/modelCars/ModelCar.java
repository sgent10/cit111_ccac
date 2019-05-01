

package modelCars;



public class ModelCar {
    
    // define memeber variables
    String color;
    String type;
    String build;
    int year;
    int serialNum;
    boolean bounce;
    final int MILESPERGALLONS = 10;
    
    // private member variables can be used to control
    // their values: outside classes access these through methods
    private boolean isEngineRunning;
    private double speed;
    private int gasTankLevel = 15;
    
    /**
     * simulates starting this car's instance engine
     */
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("...crank..crank...vroom!");
    } // close startEngine
    
    // simulates stopping this car's instance engine
    
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("...grblllll...shldunk");
    } // close stopEngine
    
    /**
     * Allows access to our private engine status boolean member
     * variable calls disEngintRunning
     * @return this car object;s current speed
     */
    public boolean checkEngineStatus(){
        return isEngineRunning;
    } // close checkEngine Status
    
    // Allows access to our private speed variable
    // @return theis car object's current speed
    public double getCurrentSpeed(){
        return speed;
    } // close getCurrentSpeed
    
    public void driveMiles(int miles){
      int gallons = miles/MILESPERGALLONS;
      gasTankLevel = gasTankLevel - gallons;
    } // close drive miles
    
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    } // close accelerate
    
    public double decelerate(int mphDecrease){
        speed = speed + mphDecrease;
        return speed;
    } // close declerate
    
    
    
    
} // close class
