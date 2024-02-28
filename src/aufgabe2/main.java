package aufgabe2;

public class main {
    public static void main(String[] args) {
        int[][] A = {{10, 5}, {4, 6}, {1, 6}};
        int[][] B = {{5, 5, 10, 3}, {10, 2, 9, 4}, {9, 10, 6, 10}, {6, 7, 9, 1}};
        int[][] C = {{10, 3, 10, 8}, {10, 3, 5, 2}};
        Matrix.displayMatrix(Matrix.transpose(A));
        Matrix.displayMatrix(Matrix.mult(A, B));
        Matrix.displayMatrix(Matrix.add(B, B));
        Matrix.displayMatrix(Matrix.mult(A, C));
    }
}