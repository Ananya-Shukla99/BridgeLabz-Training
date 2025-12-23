//a program to perform matrix advanced operation

public class MatrixAdvancedOperations
{

    // method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return matrix;
    }

    // method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // method to find determinant
    public static double determinant2x2(double[][] m) {

        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // method to find inverse
    public static double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);

        double[][] inverse = new double[2][2];

        inverse[0][0] =  m[1][1] / det;
        inverse[0][1] = -m[0][1] / det;
        inverse[1][0] = -m[1][0] / det;
        inverse[1][1] =  m[0][0] / det;

        return inverse;
    }

    // method to find inverse of
    public static double[][] inverse3x3(double[][] m) {

        double det = determinant3x3(m);
        double[][] inverse = new double[3][3];

        inverse[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        inverse[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / det;
        inverse[0][2] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;

        inverse[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / det;
        inverse[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inverse[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / det;

        inverse[2][0] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        inverse[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / det;
        inverse[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;

        return inverse;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("2x2 Matrix:");
        double[][] matrix2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2);

        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix2));

        System.out.println("Determinant: " + determinant2x2(matrix2));
        System.out.println("Inverse:");
        displayMatrix(inverse2x2(matrix2));

        System.out.println("\n3x3 Matrix:");
        double[][] matrix3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3);

        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix3));

        System.out.println("Determinant: " + determinant3x3(matrix3));
        System.out.println("Inverse:");
        displayMatrix(inverse3x3(matrix3));
		
    }
}
