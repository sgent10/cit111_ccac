
package week8;

import java.util.Scanner;


public class GeometricShapes {
    
    public static double radius;
    public static double height;
    public static double sideLength;
    public static double cylVol;
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter sidelength: ");
        sideLength = userInput.nextDouble();
        double returnedVolume = calcVolumeOfCube(sideLength);
        System.out.println("Volume: " + returnedVolume);
        System.out.println("Enter Radius: ");
        radius = userInput.nextDouble();
        System.out.println("Enter height; ");
        height = userInput.nextDouble();
        double returnedcylVol = calcVolumeOfCylinder()
                
        System.out.println("Cube Volume: " + returnedcylVol);
        
    }  // close main method
    public static double calcVolumeOfCube(double sideLength){
           double cubeVolume = Math.pow(sideLength, 3);
               
            return cubeVolume;
        } // close cube method
        
    public static void calcVolumeOfCylinder(double radius, double height){
                final double PI = 3.1416;
                double cylVol = Math.pow
                
                return cylVol;
        } // close Cyclinder method
} // close class
