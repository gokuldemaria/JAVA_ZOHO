import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("");
        System.out.println("*** NOTE: PLEASE USE ALL SMALL LETTER FORMAT ***");
        String day;
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE DAY : ");
        day = in.nextLine();
        // System.out.println(day);
        switch (day) {
            case "monday":
                System.out.println("PUSH DAY");
                break;

            case "tuesday":
                System.out.println("PULL DAY");
                break;

            case "wednesday":
                System.out.println("LEG DAY(CARDIO)");
                break;

            case "thursday":
                System.out.println("PUSH DAY");
                break;

            case "friday":
                System.out.println("PULL DAY");
                break;
            case "saturday":
                System.out.println("LEG DAY");
                break;

            case "sunday":
                System.out.println("REST DAY");
                break;

        }

    }

}
