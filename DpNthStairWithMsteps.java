import java.util.*;

class DpNthStairWithMsteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);

        System.out.println("Number of ways = " + countWays(n, m, arr));
    }

    static int countWays(int n, int m, int[] arr) {
        if (n <= 1) {
            return 1;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        int temp = 0;
        for (int j = 1; j <= m && j <= n; j++) {
            temp += countWays(n - j, m, arr);
        }

        arr[n] = temp;
        return temp;
    }
}
