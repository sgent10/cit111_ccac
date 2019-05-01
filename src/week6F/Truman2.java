
package week6F;

import java.util.Scanner;

public class Truman2 {
    
    public static void main(String[] args) {
        String lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";
        
        Scanner scanner = new Scanner(System.in);
        int ctl = scanner.nextInt();
        int stepSize = scanner.nextInt();
        int max = scanner.nextInt();;
        
        System.out.println(lady);
        do {
            if(ctl % 2 > 0) {
                System.out.println(flowers.toUpperCase());
            }
            ctl = ctl + stepSize;
        } while (ctl <= max);
        System.out.println(beetle);
    } // close main method
} // close class
