
package week7;

import java.math.BigInteger;
import java.util.Random;

public class SimpleMethodKey {

    public static void main(String[] args){
        
        System.out .println("This code is inside method: main");
        
        printStatement();
        
        System.out.println("...back in main");
        generateBigNumber();
        
        System.out.println("...back in main");
        printStatement();
    } // close main method
    
    public static void printStatement(){
        System.out.println("**********INSIDE printStatement********");
        System.out.println("Statement: Where There's a will, These's a Way");
        System.out.println("**********************************************");
        
        generateBigNumber();
    } // close printstatement
    
    public static void generateBigNumber(){
        System.out.println("**********INSIDE generateBigNumber********");
        
        Random r = new Random();
        BigInteger bigInt = new BigInteger(150, r);
        System.out.println(bigInt);
        System.out.println("**********************************************");
    }
} // close main method
