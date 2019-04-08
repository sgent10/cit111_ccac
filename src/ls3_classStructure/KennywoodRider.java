/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;

public class KennywoodRider {
    
    private static int totalRiders = 0;
    private static int totalFails = 0;
    private static int totalSickRiders = 0;
    final static int MIN_THRILL_HEIGHT = 75;
    final static int MIN_THEME_HEIGHT = 70;
    
    public static void main(String[] args){
      
        System.out.println("Begin ride simulation");
        printRideStatus();
        rideBlackWidow(13,85);
        printRideStatus();
        rideMerryGoRound(17,76);
        printRideStatus();
        rideBlackWidow(20,35);
        printRideStatus();
        rideMerryGoRound(7,100);
        printRideStatus();
        rideBlackWidow(87,3);
        printRideStatus();
    }  
      
    public static void rideBlackWidow(int Riders,int avgHeight){
        
        if(avgHeight >= MIN_THRILL_HEIGHT){
        
            System.out.println("Riding Black Widow");
            System.out.println("I haaate spiiideeeers!\n");
        
            totalRiders = totalRiders + Riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(Riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        
        } else {
            
            System.out.println(Riders + " Riders turned away sad: too short!\n");
            totalFails = totalFails + Riders;
            
        } // end if/else
    } // close ride black widow    
    
    public static void rideMerryGoRound(int Riders,int avgHeight){
       
        if(avgHeight >= MIN_THEME_HEIGHT){
            
            System.out.println("Riding MerryGoRound");
            System.out.println("Round, and Round on the merrygoround\n");
        
            totalRiders = totalRiders + Riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(Riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            
            System.out.println(Riders + "Riders turned away sad: too short!\n");
            totalFails = totalFails + Riders;
            
        } // end if/else
    } // end merrygoround   
    
    public static void printRideStatus(){
        
        System.out.println("****RIDER STATUS*****");
        System.out.println("Total Rider: " + totalRiders);
        System.out.println("Total Failed Attempts: " + totalFails);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("*********************\n");
    } // end print status 
} // end class