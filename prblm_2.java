/*Form a number system with given two numbers 3 and 4, Find the nth number of the number system
3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444 and so on*/



public class prblm_2 {
    public static void main(String[] args) {
        int first_num = 3, second_num = 4, index = 8;
        String numberArray[] = new String[index];
        numberArray[0] = "3";
        numberArray[1] = "4";
        int size = 2;
        int start = 0;
        int end = size;
        while (size < index) {
            
            int difference = end - start;
            // to add 3 as prefix,
            for (int i = start; i < end && i + size <= index ; i++) {
                numberArray[i + size] = "3" + numberArray[i];
            }
            // to add 4 as prefix
            for (int i = start; i < end && i + difference + size <= index; i++) {
                numberArray[ i + size + difference] = "4" + numberArray[i];
            }
            start = end;
            end += 4 * difference;
            size += 2 * difference;
        }
        for (String string : numberArray) {
            System.out.print(string + ", ");
        }
        
    }
    
}
