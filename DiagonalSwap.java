public class DiagonalSwap {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        int i = 0;
        int j = n;
        while(i < j){
               int temp = mat[i][i];
               mat[i][i] = mat[j-1][j-1];
               mat[j-1][j-1] = temp;
               i++;
               j--;
        }

        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
