//a program to perform matrix operations

public class MatrixOperations {

    // method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }

    // method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // method to display a matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {

        int rows = 2;
        int cols = 2;

        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix a:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix b:");
        displayMatrix(matrixB);

        System.out.println("\nAddition of Matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction of Matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nMultiplication of Matrices:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
		
    }
}