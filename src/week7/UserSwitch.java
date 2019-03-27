
package week7;

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
        int SELECTOR = userSwitch.nextInt();
        
        switch(SELECTOR){
            case 1:
                System.out.println("Fist Case");
                break;
            case 2:
                generateBigNumber();
                break;
            case 3:
                System.out.println("Matches 7777");
                break;
            default :
                System.out.println("Does Not Compute!!!!$%#@Error:code(Follow directions)");
        } // close switch
    } // close main method
    public static void generateBigNumber(){
        System.out.println("**********INSIDE generateBigNumber************");
        
        Random r = new Random();
        BigInteger bigInt = new BigInteger(150, r);
        System.out.println(bigInt);
        System.out.println("**********************************************");
    } // big number generator
} // close class
