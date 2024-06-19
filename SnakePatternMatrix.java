import java.util.Scanner;

public class SnakePatternMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements in snake pattern:");
        printSnakePattern(matrix, n);
    }

    static void printSnakePattern(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
