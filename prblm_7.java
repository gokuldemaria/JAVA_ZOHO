//  *** PROBLEM ***
//  GET A STRING CONTAINING PALINDROMES FROM THE USER
//  WRITE A CODE TO  FIND OUT AND TO DISPLAY THE LONGEST PALINDROME IN THE GIVEN STRING. 

//  SAMPLE:
//  INPUT : leel malayalam tree hanah
//  OUTPUT: malayalam

import java.util.Scanner;

public class prblm_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String resultPalindrome = "";
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("ENTER UR STRING : ");
        String str = in.nextLine();
        System.out.println("");
        String[] arr = str.split(" "); // SEPERATING THE WORDS AND STORING EVERY WORD AS AN ELEMENT IN AN ARRAY.

        for (String word : arr) {
            String reversedWord = prblm_7.strRev(word); // REVERSING THE WORD BY CALLING THE FUNCTION AND STORING THE REVERSED WORD IN
            if (reversedWord.equals(word) && resultPalindrome.length() < word.length()) { // CHECKING THE SIZE OF WORDS.
                    resultPalindrome = word; // FETCHING THE LONGEST                                                                         // PALINDROME.
            }

        }
        System.out.println("THE LONGEST PALINDROME IN THIS STRING IS: " + resultPalindrome); // DISPLAYING THE RESULT.
    }

    public static String strRev(String a) { // METHOD TO REVERSE A STRING.
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }
}
