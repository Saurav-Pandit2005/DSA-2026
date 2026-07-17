// Diagonal Sum

package Arrays_2D;

public class Q3 {
    public static int Diagonal_Sum(int matrix[][]) {
        // 1. Brute Force - O(n^2)

        // int sum = 0;
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix.length; j++) {

        //         // Primary Diagonal - (i == j)
        //         if(i == j) {
        //             sum+=matrix[i][j];
        //         }

        //         // Secondary Diagonal - (i + j = n-1)
        //         else if (i+j == matrix.length-1) {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;


        // 2. Brute Force - O(n)

        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            // Primary Diagonal - (i == j) = (i == i)
            sum+= matrix[i][i];
            // Secondary Diagonal - (i + j = n-1) = (j = n-i-1)
            if(i != matrix.length-i-1) sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
                        };

        System.out.println(Diagonal_Sum(matrix));
    }
}
