
package week3F;

public class WhatsMyVaule2 {
    public static void main(String[] args){
        boolean tomato = true;
        boolean ginger = false;
        int oregeno = 50;
        int fenugreek = 2;
        if(tomato){
            oregeno = oregeno / fenugreek;
        }else{
            oregeno = fenugreek;   
        }
        if(ginger && tomato){
            oregeno = oregeno * fenugreek;
        }
        ginger = !ginger;
        System.out.println("Tomato: " + tomato);
        System.out.println("Ginger: " + ginger);
        System.out.println("Oregeno: " + oregeno);
    }
    
}
