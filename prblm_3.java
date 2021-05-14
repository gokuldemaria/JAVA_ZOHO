/* 

DYNAMICALLY GETTING INPUT FOR AN ARRAY AND PRINTING THE MAXIMUM AND MINUMUM 
VALUES IN THE ARRAY.

SAMPLE INPUT : 90 78 99 67 45[]
SAMPLE OUTPUT : 
               THE MAX VALUE IS : 99
               THE MIN VALUE IS : 45  */

import java.util.Scanner;

public class prblm_3 {
    public static void main(String[] args) {
        int array[] = new int[5];
        int max = 0, secMax = 0, min = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("ENTER THE MARKS: ");
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.print("MARK" + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secMax = max;
                max = array[i];
            } else if (array[i] > secMax) {
                secMax = array[i];
            }
        }
        System.out.println("THE MAXIMUM MARK IS : " + max);
        System.out.println("THE 2nd MAXIMUM MARK IS : " + secMax);

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("THE MINIMUM MARK IS : " + min);
    }

}
