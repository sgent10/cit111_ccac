
package week12;


public class ProgrammingBooks {
    
    public static void main(String[] args){
        
        String[] books = new String[5];
        
        books[0] = "Peral Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "Javascript: The Definitive Guide";
        books[4] = "Java in a Nutshell";
        
    } // close main
    
    public static void printArrayContents(String[] aarayInsideMethod){
        
        System.out.println("************* Extract array value and store it **********");
        // Extract content of each array bin, then print it to the console
        String extractedArrayValue = aarayInsideMethod[0];
        System.out.println("Book at array at index 0: " + extractArrayValue );
        // do this process for each bin of teh array
        
        extractedArrayValue = arrayIsideMethod[1];
        System.out.println("Book at array index 1: " + extractedArrayValue );
        extractedArrayValue = arrayIsideMethod[2];
        System.out.println("Book at array index 2: " + extractedArrayValue );
        extractedArrayValue = arrayIsideMethod[3];
        System.out.println("Book at array index 3: " + extractedArrayValue );
        extractedArrayValue = arrayIsideMethod[4];
        System.out.println("Book at array index 4: " + extractedArrayValue );
        
    } // close print array
    
} // close class
