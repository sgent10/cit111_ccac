
package ls3_classStucture;

import java.util.Random;

public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFails = 0;
    private static int totalSickRiders = 0;
    final static int MINTHRILLHEIGHT = 75;
    final static int MINTHEMEHEIGHT = 70;
    
    public static void main(String[] args){
      printRideStatus();
      if()
      
    }
    public static void rideBlackWidow(int Riders,int avgHeight){
        System.out.println("Riding Black Widow");
        System.out.println("I haaate spiiideeeers!");
        
        
        totalRiders = totalRiders + Riders;
    }
    public static void rideMerryGoRound(int Riders,int avgHeight){
        System.out.println("Round, and Round on the merrygoround");
        
        totalRiders = totalRiders + Riders;
    }
    public static void printRideStatus(){
        System.out.println("Begin ride simulation");
        System.out.println("****RIDER STATUS*****");
        System.out.println("Total Rider: " + totalRiders);
        System.out.println("Total Failed Attempts: " + totalFails);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("*********************");
    }