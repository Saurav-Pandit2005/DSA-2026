// Search in Sorted Matrix

package Arrays_2D;

public class Q4 {
    // Using Linear Search O(n^2) => Check Q1.java

    // StairCase Search - O(n + m)
    public static boolean Search_matrix(int matrix[][], int target) {
        int row = 0, column = matrix[0].length-1;
        while (row < matrix.length && column >= 0) {
            if(matrix[row][column] == target) return true;
            else if (matrix[row][column] < target) row++;
            else column--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
                        };

        int target = 10;

        System.out.println(Search_matrix(matrix, target));
    }
}
