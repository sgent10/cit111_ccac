
package week7F;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;


public class UserSwitch {
    
    public static void main(String[] args){
        
        Scanner userSwitch = new Scanner(System.in);
        System.out.println("****** switches and methods *******");
        System.out.println("Options:");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here!");
        System.out.println("Enter an int and press enter: ");
        int input = userSwitch.nextInt();
        
        switch(SELECTOR){
            case 1:
                System.out.println("Fist Case");
//                break;
            case 2:
                System.out.println("**********INSIDE ");
                break;
            case 3:
                System.out.println("Matches 7777");
                break;
            default :
                System.out.println("Does Not Compute!!!!$%#@Error:code(Follow directions)");
        } // close switch
    } // close main method
} // close class
