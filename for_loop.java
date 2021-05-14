import java.util.*;

class for_loop {
    
    public static void main(String[] args) {

        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A VALUE :");
        a = in.nextInt();
        System.out.println("THE VALUE OF a IS :" + a);

        for (int x = 1; x < a; x++) {
            for (int y = x; y < a; y++) {
                System.out.print("x");
                
            }
            System.out.println("");
       } 
            
    }
}