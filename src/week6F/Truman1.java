
package week6F;

import java.util.Scanner;

public class Truman1 {
    
    public static void main(String[] args){
        String Lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";
        
        Scanner scanner = new Scanner(System.in);
        int ctl = scanner.nextInt();
        int stepSize =scanner.nextInt();
        int max = scanner.nextInt();
        
        System.out.println(Lady);
        while (ctl <= max){
            System.out.println(flowers);
            ctl = ctl + stepSize;
        }
        System.out.println(beetle);
    }
    
}
