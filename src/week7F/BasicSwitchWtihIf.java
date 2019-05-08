
package week7F;


public class BasicSwitchWtihIf {
    
    public static void main(String[] args){
        
        final int SELECTOR = 1;
        
        if(SELECTOR == 1){
            System.out.println("Fist Case");
            
        }else if(SELECTOR == 2){           
                System.out.println("Second Case");
        }else if(SELECTOR == 777){
                System.out.println("Matches 777");
        }else{ 
                System.out.println("Default case");
        } // close switch
    } // close main method
} // close class
