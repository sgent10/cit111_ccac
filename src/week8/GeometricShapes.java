
package week8;

import java.util.Scanner;


public class GeometricShapes {
    
    public static void main(String[] args){
        double sideLength;
        double radius;
        double height;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter sidelength: ");
        sideLength = userInput.nextDouble();
        double returnedVolume = calcVolumeOfCube(sideLength);
        System.out.println("Volume: " + returnedVolume);
        System.out.println("Enter Radius: ");
        radius = userInput.nextDouble();
        System.out.println("Enter height; ");
        height = userInput.nextDouble();
        double returncylVol = calcVolumeOfCylinder(double radius, double height);
        System.out.println("Cube Volume: " + returncylVol);
        
    }  // close main method
        public static double calcVolumeOfCube(double sideLength){
           double cubeVolume = Math.pow(sideLength, 3);
               
            return cubeVolume;
        } // close cube method
        
        public static double calcVolumeOfCylinder(double radius, double height){
                final double PI = 3.1416;
                double cylVol = PI * (radius * radius) * height;
                
                return cylVol;
        } // close Cyclinder method
} // close class
