import java.util.*;
class CoinChange{
    static int MinCoins(int coins[], int m, int V)
    {
        int dp[] = new int[V + 1];
        dp[0] = 0;
        for (int i = 1; i <= V; i++)
            dp[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= V; i++) {
            for (int j = 0; j < m; j++)
                if (coins[j] <= i) {
                    dp[i]=Math.min(dp[i],dp[i - coins[j]] + 1);
                }
        }
        if(dp[V]==Integer.MAX_VALUE)
            return -1;
        return dp[V];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins");
        int n = sc.nextInt();
        int coins[] = new int[n];
        System.out.println("Enter the coins");
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the value");
        int v = sc.nextInt();
        System.out.println("Minimum number of coins required is "+MinCoins(coins,n,v));
        
    }
}