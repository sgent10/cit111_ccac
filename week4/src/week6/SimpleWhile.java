package week6;

import java.util.Scanner;

public class SimpleWhile {
    public static void main(String[] args){
        int userInput;
        String userPhrase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of loops!: ");
        userInput = scanner.nextInt();
        System.out.println("Enter a phrase for the loop: ");
        userPhrase = scanner.next();
        
        for(int numLoops = 0; numLoops < userInput; numLoops = numLoops + 1){
            System.out.println(userPhrase + " " + numLoops);
        } // end while
        
        System.out.println("...After the while loop");
    } // close main 
} // close class
