/* PROGRAM 1
Write a program to find the percentage of uppercase letters, lowercase letters, digits and other special characters(including space) in the given string.  

Sample Input : Seagull flies @ The Speed Of 320 km/hour
Output : 
The percentage of upperCount case letters is 10%
The percentage of CaseCount case letters is 60%
The percentage of digits is 7.5%
The percentage of special characters is 22.5%

Sample Input : WHEN THE WORLD says "give up", HOPE WHISPERS "try it one more time".
Output : 
The percentage of upperCount case letters is 35.8%
The percentage of CaseCount case letters is 38.806%
The percentage of digits is 0%
The percentage of special characters is 26.9% */

import java.util.Scanner;
public class prblm_1 {
    public static void main(String[] args) {
        String word;
        int upperCaseCount = 0, lowerCaseCount = 0, specialCaseCount = 0, digitCount = 0;
        float upperCasePercentage, lowerCasePercentage, specialPercentage, digitPercentage;
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.print("ENTER UR STRING : ");
        word = in.nextLine();
        // System.out.println(word);
        char a[] = word.toCharArray();
        // System.out.println(a.length);

        /*
         * for (int i = 0; i < a.length; i++) { // System.out.println(a[i]); if
         * (Character.isUpperCase(a[i])) { upperCount += 1; }
         * 
         * else if (Character.isDigit(a[i])) { Count += 1; }
         * 
         * else if (Character.isLowerCase(a[i])) { CaseCount += 1; }
         * 
         * else if (Character.isWhitespace(a[i]) || !Character.isLetterOrDigit(a[i])) {
         * special += 1; }
         * 
         * }
         */

        for (int i = 0; i < a.length; i++) {
            if (Character.isLetter(a[i])) {
                if (Character.isUpperCase(a[i])) {
                    upperCaseCount += 1;
                } else {
                    lowerCaseCount += 1;
                }
            }

            else if (Character.isDigit(a[i])) {
                digitCount += 1;
            }

            else {
                specialCaseCount += 1;
            }

        }
        /*
         * System.out.println("UPPER CASE LETTERS : " + upperCaseCount);
         * System.out.println("LOWER CASE LETTERS : " + lowerCaseCount);
         * System.out.println("SPECIAL CHARACTERS : " + specialCaseCount);
         * System.out.println("DIGITS : " + digitCount);
         */

        upperCasePercentage = (100 / a.length) * upperCaseCount;
        System.out.println(" THE PERCENTAGE OF UPPERCASE : " + upperCasePercentage);

        lowerCasePercentage = (100 / a.length) * lowerCaseCount;
        System.out.println(" THE PERCENTAGE OF LOWER CASE : " + lowerCasePercentage);

        specialPercentage = (100 / a.length) * specialCaseCount;
        System.out.println(" THE PERCENTAGE OF SPECIAL CHARACTERS : " + specialPercentage);

        digitPercentage = (100 / a.length) * digitCount;
        System.out.println(" THE PERCENTAGE OF DIGITS : " + digitPercentage);

    }

}
