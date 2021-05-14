
public class Matrix {
    public static void main(String[] args) {
        
        int n = 10;
        int matrixArr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = (i * n) + (j + 1);
                matrixArr[i][j] = num;
                //System.out.print(num + " ");
            }
            //System.out.println();
        }
        
        for (int i = (n - 1); i >= 0; i--) {
            int jStart;
            int jEnd;

            if (i % 2 != 0) {
                jStart = 1 - n;
                jEnd = 1;
                // for (int j = (n - 1); j >= 0; j--) {
                //     System.out.print(matrixArr[i][j] + " ");

                // }
                // System.out.println();
            } else {
                jStart = 0;
                jEnd = n;
                // for (int j = 0; j < n; j++) {
                //     System.out.print(matrixArr[i][j] + " ");          
                // }
                // System.out.println();
            }
            for (int j = jStart; j < jEnd; j++) {


                int column = Math.abs(j); 
                System.out.print(matrixArr[i][column] + " ");
            }
            System.out.println();
        }
    }
}