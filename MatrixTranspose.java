import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int res[][] = new int[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 3; j++) {
                res[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
