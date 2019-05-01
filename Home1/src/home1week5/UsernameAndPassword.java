package week5;


import java.util.Scanner;
        
public class UsernameAndPassword {
    public static void main(String[] args){
        // these are constant that we'll authenticate against
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        // storage variables for user data
        String enteredUsername;
        String enteredPasswd;
        
        // creater our Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // promt user for username
        System.out.println("Enter your username followed by enter:");
        //read username typed in to keyboard into varible
        enteredUsername = userInputScanner.next();
        
        System.out.println("Enter your password followed by enter:");
        // read username typed in to keyboard into variable
        enteredUsername = userInputScanner.next();
        
       System.out.println("Enter your password followed by enter:");
       // use the dame Scanner to read in the entered password
       enteredPasswd = userInputScanner.next();
       
       //check if both the username and password match the correct ones
       if(enteredUsername.equals(CORRECT_USERNAME) && enteredPasswd.equals(CORRECT_PASSWORD)){
        // successful authenication message
        System.out.println("Authenication Successful! You have logged");
       } else {
            // failed authenication message
            System.out.println("Failure to authenticate! This atttempt will not be recorded");
    } // end if/else blocks
        
    } // close main method
} // close class UserAndPassword
