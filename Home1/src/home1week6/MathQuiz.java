
package week6;

import java.util.Scanner;
import java.util.Random;

public class MathQuiz {
    
    public static void main(String[]){
        int userInput = userInput;
        int userAnswer = userAnswer;
        Scanner scanner = new Scanner(System.in);

        
        final int UPPER_END_OF_RANGE = 100;
        Random randGenerator = new Random();
        int randNum = randGenerator.nextInt(UPPER_END_OF_RANGE);
        do{
            System.out.println("**Math Quiz**");
            System.out.println("Solve for the value: " + "(10 % randGenerator) * 2 = " + userInput);
            String input = Scanner.nextLine();
        }
        
    }
}
