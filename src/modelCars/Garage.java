/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelCars;

/**
 *
 * @author sgent10
 */
public class Garage {
    
    public static void main(String[] args){
        
        //create a new instance of a car object with the keyword: new
        ModelCar lowRider = new ModelCar();
        // set member variables on the instance of car stored in lowRider
        lowRider.year = 1964;
        lowRider.build = "Impala";
        lowRider.bounce = true;
        lowRider.color = "Charcoal";
        lowRider.serialNum = 11851;
        lowRider.type = "Muscle";
        
        ModelCar deLorean = new ModelCar();
        deLorean.year = 1983;
        deLorean.build = "DeLorean";
        deLorean.bounce = false;
        deLorean.color = "White";
        deLorean.serialNum = 071234;
        deLorean.type = "Tuner";
        
        
        // send our Car instance to a helper method to print its meemer variables
        displayModelCarStats(deLorean);
        // test its methods
        deLorean.startEngine();
        deLorean.accelerate(85);
        deLorean.decelerate(20);
        // check status again
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);
    } // close main    
        
    public static void displayCarStats(ModelCar anyCarObject){
        System.out.println("*****STATS*****");
        System.out.println(anyCarObject.year + " " + anyCarObject.build + " " + anyCarObject.serialNum);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.out.println("*******************");
    } // close display car stats
    
} // close class
