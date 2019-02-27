
package weektwobasics;

import java.util.Scanner;

/**
 *Implements a basic response tabulation system based on the user's response to
 * a question of interest. This program illustrates the use of an if()statement
 * to control the response given to the user. A while()loop is used to repeatedly
 * ask the user the same question without duplicating any code.
 * @author sgent10
 */
public class Tabulator {
    
    public static void main(Sting[] args){
        // create a scanner for gathering user unput
        Scanner scanner = new Scanner(System.in);
        
        // declare and initiate our two counter variables to zero
        int totalRespondents = 0;
        int numLinuxUsers = 0;
        
        System.out.println("LINUX USERS SURVEY");
        
        //this wile loop[ will proceed indefinitely since the value "true"
        //will always be true, resulting in an infinte loop
        while(true){
            System.out.println(">>>>>>>>>>QUESTION<<<<<<<<<<<<");
            System.out.println("Do you regularly use Linux software? (Android == Linux!!)");
            System.out.println("(Enter 1 for YES and 0 for NO");
            
            int userResponse = scanner.nextInt();
            
            //
                    
        }
        
    }
}
