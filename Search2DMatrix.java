import java.util.Scanner;

public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Taking user input for the target value
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Searching the target in the matrix
        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + (found ? "found" : "not found") + " in the matrix.");

    }

    // Function to search for a target value in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            // Find the middle index in the flattened matrix
            int mid = left + (right - left) / 2;

            // Convert mid index to row and column
            int row = mid / cols;
            int col = mid % cols;

            // Check if the middle element is the target
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                // Search right half
                left = mid + 1;
            }
            else {
                // Search left half
                right = mid - 1;
            }
        }
        return false;
    }
}
