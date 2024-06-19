import java.util.Scanner;

public class ModifyMatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        modifyMatrix(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void modifyMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int leftDiagonalSum = 0;
                for (int k = i - 1, l = j - 1; k >= 0 && l >= 0; k--, l--) {
                    leftDiagonalSum += mat[k][l];
                }

                int rightDiagonalSum = 0;
                for (int k = i - 1, l = j + 1; k >= 0 && l < cols; k--, l++) {
                    rightDiagonalSum += mat[k][l];
                }

                mat[i][j] = Math.max(leftDiagonalSum, rightDiagonalSum);
            }
        }
    }
}
