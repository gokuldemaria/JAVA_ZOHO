import java.util.Scanner;

public class RotatingTheImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE IMAGE : "); 
        int n = in.nextInt();
        int num[][] = new int[n][n];

        System.out.println("ENTER VALUES:"); 
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = in.nextInt();
            }
        }

        clock(num, n); 
        antiClock(num, n); //for getting the original image
        antiClock(num, n);
                          

        System.out.println("");
        System.out.println("ANTI-CLOCK-WISE :");
        for (int i[] : num) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

    public static int clock(int[][] num, int n) { 
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

    public static int antiClock(int[][] num, int n) { 

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