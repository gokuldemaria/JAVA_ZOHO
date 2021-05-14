import java.util.Scanner;

public class prblm_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[][] = new int[2][2];
        int clockNum[][] = new int[2][2];
        int AntiClockNum[][] = new int[2][2];

        System.out.println("ENTER VALUES:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = in.nextInt();

            }

        }

        // clock wise shifting
        clockNum[0][0] = num[1][0];
        clockNum[0][1] = num[0][0];
        clockNum[1][0] = num[1][1];
        clockNum[1][1] = num[0][1];

        // anti-clock wise shifting
        AntiClockNum[0][0] = num[0][1];
        AntiClockNum[0][1] = num[1][1];
        AntiClockNum[1][0] = num[0][0];
        AntiClockNum[1][1] = num[1][0];

        System.out.println("CLOCK-WISE ROTATION:"); // PRINTING THE CLOCKWISE ROTATED ARRAY.
        for (int i[] : clockNum) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("ANTI-CLOCK WISE ROTATION:"); // PRINTING THE ANTI-CLOCK WISE ROTATED ARRAY
        for (int i[] : AntiClockNum) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}