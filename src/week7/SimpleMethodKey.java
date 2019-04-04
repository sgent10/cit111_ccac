
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
    }
}
