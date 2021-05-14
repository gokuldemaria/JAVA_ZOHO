import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE THE NUMBER :");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("THE GIVEN NUMBER IS EVEN");
        }
        else if (a % 2 != 0) {
            System.out.println("THE GIVEN NUMBER IS ODD");
        }
        else {
            System.out.println("INPUT IS NOT VALID");
        }
    }
        
}

