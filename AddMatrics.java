import java.util.Scanner;

public class AddMatrics {
    public static void main(String[] args) {

        // Check command-line argument
        if (args.length == 0) {
            System.out.println("Please provide matrix order N as command-line argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N <= 0) {
            System.out.println("N should be a positive integer.");
            return;
        }

        System.out.println("The order of the matrix is: " + N);
        System.out.println("Enter elements of Matrix A:");

        Scanner in = new Scanner(System.in);

        int[][] matrixA = readMatrix(N, in);
        int[][] matrixB = generateRandomMatrix(N);

        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        int[][] resultMatrix = addMatrices(matrixA, matrixB);

        System.out.println("\nMatrix A + Matrix B:");
        printMatrix(resultMatrix);

        in.close();
    }

    // Read matrix from user
    public static int[][] readMatrix(int N, Scanner in) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    // Generate random matrix
    public static int[][] generateRandomMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int N = A.length;
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
