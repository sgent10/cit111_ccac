
package week6F;

public class LoopsTruman {
    public static void main(String[] args){
        int ctl = 2;
        int target = 4;
        boolean keepLooping = true;
        
        while(keepLooping){
            System.out.println("ctl: " + ctl);
            System.out.println("target: " + keepLooping);
            if(ctl > target){
                keepLooping = false;
            }
            ctl++;
        } // close while
    } // close main method
} // close class
