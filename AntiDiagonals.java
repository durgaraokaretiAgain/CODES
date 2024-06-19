import java.util.*;

public class AntiDiagonals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix size:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix values:");
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result:");
        printResult(matrix);
    }

    public static void printResult(int[][] matrix) {
        ArrayList<ArrayList<Integer>> result = getAntiDiagonals(matrix);

        for (ArrayList<Integer> diagonal : result) {
            System.out.println(diagonal);
        }

        System.out.println();
    }

    public static ArrayList<ArrayList<Integer>> getAntiDiagonals(int[][] matrix) {
        int n = matrix.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < 2 * n - 1; i++) {
            ArrayList<Integer> diagonal = new ArrayList<>();

            int Row = Math.max(0, i - n + 1);
            int Col = Math.min(i, n - 1);

            while (Row < n && Col >= 0) {
                diagonal.add(matrix[Row][Col]);
                Row++;
                Col--;
            }

            result.add(diagonal);
        }

        return result;
    }
}
