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
        deLorean.color = "White";
        deLorean.bounce = false;
        deLorean.serialNum = 071234;
        deLorean.type = "Tuner";
        deLorean.build = "DeLorean";
        
        
        // send our Car instance to a helper method to print its meemer variables
        displayCarStats(deLorean);
        // test its methods
        deLorean.startEngine();
        deLorean.accelerate(85);
        deLorean.decelerate(20);
        // check status again
        displayCarStats(deLorean);
        lowRider.stopEngine();
        displayCarStats(deLorean);
        
    } // close main    
        
} // close class
