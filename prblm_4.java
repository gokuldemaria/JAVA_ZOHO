/* 
 TASK 1: COUNTING THE CHARACTERS PRESENT IN A STRING AND PRINTING THE COUNT.
 TASK 2: PRINTING ONLY THE CHARACTERS THAT HAS BEEN REPEATED ODD TIMES.
 CONDITION < the order of the output string must be same as the given input string order>

#1
SAMPLE INPUT : TREE
SAMPLE OUTPUT : 
                 T = 1
                 R = 1
                 E = 2

                result string is: TR

#2
SAMPLE INPUT : elephant
SAMPLE OUTPUT : 
                e = 2
                l = 1
                p = 1
                h = 1
                a = 1
                n = 1
                t = 1

                result string is: lphant
*/

import java.util.LinkedHashMap;
import java.util.Scanner;

public class prblm_4 {
    public static void main(String[] args) {
        String str; // for user input.
        Scanner in = new Scanner(System.in);
        System.out.println(""); // formating purpose.
        System.out.println("");
        System.out.print("ENTER UR STRING : ");
        str = in.nextLine();
        char arr[] = str.toCharArray(); // converting the string to character array.

        // using a linked hashmap for retaing the order.
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : arr) { // counting the number of occurances for each character.
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }

        }

        var entrySet = charCountMap.entrySet(); // for iterating over the map.
        char result[] = new char[arr.length]; // for storing the result.
        int i = 0;
        System.out.println("");

        for (var entry : entrySet) { // iterating over the map.
            System.out.println(entry.getKey() + " = " + entry.getValue()); // printing the count of each character.
            if (entry.getValue() % 2 != 0) { // spoting the odd counted characters.
                result[i] = entry.getKey(); // storing them in an char array.
                i += 1;
            }
        }

        System.out.println("");
        System.out.print("THE RESULT STRING IS: ");

        for (char c : result) { // printing the result.
            System.out.print(c);
        }
        System.out.println("");
    }
}