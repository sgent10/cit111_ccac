
package clientManagement;

import java.util.Scanner;

public class Registration {
    
    public static void main(String[] args) {
       System.out.println("This is class Registration!");
       System.out.println("Please enter your current student ID number: ");
       Scanner scanner = new Scanner(System.in);
       int studentID = scanner.nextInt();
       System.out.println("Saved to archive Student ID:" + studentID);
    } // close main method
} // close class
