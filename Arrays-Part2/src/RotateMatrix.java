public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = swap;
            }
        }
    }
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }
    }
}
