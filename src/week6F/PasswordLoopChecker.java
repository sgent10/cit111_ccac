/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6F;

import java.util.Scanner;

/**
 *
 * @author sgent10
 */
public class PasswordLoopChecker {
    public static void main(String[] args){
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        String enteredUsername;
        String enteredPasswd;
        boolean lock = true ;
        int attempts = 0;
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Attemps:0/3");
        System.out.println("Enter your username followed by enter: ");
        enteredUsername = userInputScanner.next();
        
       while(lock){ 
        System.out.println("Enter your password followed by enter: ");
        enteredPasswd = userInputScanner.next();
        if(attempts > 3)
            lock = false;
                    
            if(enteredPasswd.equals(CORRECT_PASSWORD)){
            System.out.println("Authenication Successful! You have logged");
            break;
            } else {
            attempts++;
            System.out.println("Failure to authenticate! This atttempt will be recorded: 3/" + attempts );
            
        if(lock = false){
            System.out.println("You are locked out Goodbye..");
            break;
            }
        }    
      } 
    }   
}
