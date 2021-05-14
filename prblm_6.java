//  *** PROBLEM ***

//  GET A STRING FROM THE USER AND REVERSE THE WORDS IN THE STRING
//  PRINT THE STRING IN THE GIVEN ORDER.

//  SAMPLE: 1
//  INPUT : AS U KNOW
//  OUTPUT: SA U WONK  

import java.util.Scanner;

public class prblm_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("ENTER UR STRING : ");
        String str = in.nextLine();
        System.out.println("");
        System.out.print("UR REVERSED STRING :");
        String[] arr = str.split(" ");             // SEPERATING THE WORDS AND STORING EVERY WORD AS AN ELEMENT IN AN ARRAY.
        for (String a : arr) {
            a = strRev(a);                         // METHOD CALL : AND JUST PRINTING THE RESULT.
            System.out.print(" " + a);
        }
        System.out.println(" ");

    }

    public static String strRev(String a) {
        StringBuilder sb = new StringBuilder(a); // USING STRING BUILDER COZ STRINGS CANNOT BE MODIFIED. AND PASSING THE WORD FROM THE MAIN METHOD TO THE SB.
        return sb.reverse().toString();          // NOW REVERSING THE WORD AND CONVERTING THE STRING BUILDER TYPE TO STRING TYPE AND RETURNING THE WORD REVERSED.
    }

}
