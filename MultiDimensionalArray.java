public class MultiDimensionalArray {

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Display the matrix
            System.out.println("Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Calculate the sum of all elements
            int sum = 0;
            for (int[] row : matrix) {
                for (int value : row) {
                    sum += value;
                }
            }
            System.out.println("Sum of all elements: " + sum);
        }
    }

