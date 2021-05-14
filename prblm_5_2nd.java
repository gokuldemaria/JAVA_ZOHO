//  ROTATING AN IMAGE BY 90 DEGREE CLOCKWISE AND ANTICLOCKWISE.
//  REFER MATHAN ANNA'S INSTA INBOX FOR FULL VERSION OF THE QUESTION.

import java.util.Scanner;

public class prblm_5_2nd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE IMAGE : "); // getting the size of the array.
        int n = in.nextInt();
        int num[][] = new int[n][n];

        System.out.println("ENTER VALUES:"); // getting the elements of the array.
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = in.nextInt();
            }
        }

        clock(num, n); // clockwise call
        antiClock(num, n);// calling it twice becoz by doing clock wise we have already rotated once..
        antiClock(num, n);// so if we do anti clock wise only once the result will be same as the given
                          // input..

        System.out.println("");// printing the anticlockwise image from here.
        System.out.println("ANTI-CLOCK-WISE :");
        for (int i[] : num) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

    public static int clock(int[][] num, int n) { // method for rotating the image clockwise

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = num[i][j];
                num[i][j] = num[n - 1 - j][i];
                num[n - 1 - j][i] = num[n - 1 - i][n - 1 - j];
                num[n - 1 - i][n - 1 - j] = num[j][n - 1 - i];
                num[j][n - 1 - i] = temp;
            }
        }

        System.out.println("");
        System.out.println("CLOCK-WISE :");
        for (int i[] : num) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        return 0;

    }

    public static int antiClock(int[][] num, int n) { // method for rotating anti_clock wise

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = num[i][j];
                num[i][j] = num[j][n - 1 - i];
                num[j][n - 1 - i] = num[n - 1 - i][n - 1 - j];
                num[n - 1 - i][n - 1 - j] = num[n - 1 - j][i];
                num[n - 1 - j][i] = temp;
            }
        }
        return 0;

    }

}
