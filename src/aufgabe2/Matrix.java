package aufgabe2;
public class Matrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
    public static int[][] add(int[][] A, int[][] B) {
        if (A.length == B.length && A[0].length == B[0].length) {
            int[][] addedMatrix = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    addedMatrix[i][j] = A[i][j] + B[i][j];
                }
            }
            return addedMatrix;
        }
        else {
            int[][] substituteMatrix = new int[0][0];
            System.out.println("Dimensionen stimmen nicht überein");
            return substituteMatrix;
        }
    }
    public static int[][] mult (int[][] A, int[][] B){
        if (A[0].length == B.length) {
            int[][] multipliedMatrix = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        multipliedMatrix[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return multipliedMatrix;
        }
        else {
            int[][] substituteMatrix = new int[0][0];
            System.out.println("Dimensionen stimmen nicht überein");
            return substituteMatrix;
        }
    }
    public static void displayMatrix (int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}