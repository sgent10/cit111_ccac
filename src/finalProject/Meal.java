
package finalProject;

import java.util.Scanner;

public class Meal {
    
    int entreNum;
    double entreTotal = 0;
    int sideNum;
    double sideTotal = 0;
    double totalRevenu = 0;
    
    final double entrePrice1 = 9.97;
    final double entrePrice2 = 17.97;
    final double entrePrice3 = 12.97;
    final double sidePrice1 = 3.03;
    final double sidePrice2 = 2.03;
    final double sidePrice3 = 1.03;
    
    
 public void placeEntreOrder(){
     
     System.out.println("What meal would you like to order today? ");
     System.out.println("(enter order number 1, 2, or 3): ");
     Scanner placeEntreOrder = new Scanner(System.in);
     entreNum = placeEntreOrder.nextInt();
        
    switch(entreNum){
            case 1:
            System.out.println("*****************");
               entreTotal = entrePrice1 + entreTotal;
                break;
            case 2:
            System.out.println("*****************");
               entreTotal = entrePrice2 + entreTotal;
            
                break;
            case 3:
            System.out.println("*****************");
               entreTotal = entrePrice3 + entreTotal;
            
                break;
    } // close switch
     
 } // close placeEntreOrder
 public void placeSideOrder(){
     
     System.out.println("What side would you like to order today? ");
     System.out.println("(enter order number 1 or 2): ");
     Scanner placeSideOrder = new Scanner(System.in);
        sideNum = placeSideOrder.nextInt();
        
     switch(sideNum){
            case 1:
            System.out.println("*****************");
               entreTotal = sidePrice1 + entreTotal;
               totalRevenu = totalRevenu + entrePrice1;
                break;
            case 2:
            System.out.println("*****************");
               entreTotal = sidePrice2 + entreTotal;
               totalRevenu = totalRevenu + entrePrice2;
                break;
            case 3:
            System.out.println("*****************");
               entreTotal = sidePrice3 + entreTotal;
               totalRevenu = totalRevenu + entrePrice3;
            
                break;
        } // close switch    
     
 } // close placeSideOrder
 public void printTotalRevenu(){
     
     System.out.println("The Resturant has made:$ " + totalRevenu);
     
 } // close print revenu
 
 
    
} // close class
