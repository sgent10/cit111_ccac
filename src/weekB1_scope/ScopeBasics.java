
package weekB1_scope;


public class ScopeBasics {
    // our first member varible: this named chunk of datat
    // written to by ANY code in this class--meaning any method!
    private static String classScopedVar = "All methods can access me!";
    
    // This method demonstrates which variables can be
    // accessed in its local scope: only class-scoped varible and its own
    // local variable called localScope2
    public static void demonstrateScope(){
        System.out.println("Inside demonstrateScope");
        // declation and initialziation of a local variable to demonstrateScope
        String localScope2 = "I'm local to demonstrateScope";
        
        System.out.println(localScope1); // localScope1 was declared in
                                         // and cannot be accessed by any other
                                         // method
        System.out.println(classScopedVar);
//        System.out.println(localScoped2);
        
        // any method can change a class=scoped variable's value
        classScopedVar = "I can be changed in any method.";
        
    } // cloass demonstrateScope
    
    // Remember: the main method can be located anywhere you want--method order
    // within a class doesn't effect the execution of the code itself.
    public static void main(String[] args){
        System.out.println("Inside Main");
        // declation and initialziation of a local varible to main
        String localScope1 = "I'm local to main";
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
//        System.out.println(localScope2); // localScope2 is only accessible in
                                         // the method in which it is declared:
                                         // which is demonstrateScope
                                         
        // call a method that will test varible scope concepts
        demonstrateScope();
        
    } // close main
} // close class
