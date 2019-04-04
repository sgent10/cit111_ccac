
package week3;

public class WhatsMyValue1 {
    public static void main(String[] args){
        int saturn = 100;
        int mars = 20;
        int comet = saturn / mars;
        mars = comet * 10;
        saturn = mars % 10;
        System.out.println("Saturn: " + saturn);
        System.out.println("Mars: " + mars);
        System.out.println("Comet: " + comet);
    } // close main method
    
} // close class WhatsMyValue
