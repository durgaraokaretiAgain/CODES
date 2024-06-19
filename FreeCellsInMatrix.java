import java.util.*;

public class FreeCellsInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[][] matrix = new int[N][N];

        for (int k = 0; k < K; k++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();

            for (int i = 0; i < N; i++) {
                matrix[r - 1][i] = 1; 
                matrix[i][c - 1] = 1; 
            }

            int freeCells = countFreeCells(matrix);
            System.out.print(freeCells + " ");
        }


    }

    static int countFreeCells(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
