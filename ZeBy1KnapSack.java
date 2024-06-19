import java.util.*;
class ZeBy1KnapSack{
    static int knapsack(int[] val,int[] wt,int w,int n){
        int[][] dp = new int [n+1][w+1];
        for(int i=0;i<=n;i++)
            dp[i][0] = 0;
        for(int j=0;j<=w;j++)
            dp[0][j]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j)
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        System.out.println("Enter the values of the items");
        for(int i=0;i<n;i++)
            val[i] = sc.nextInt();
        System.out.println("Enter the weights of the items");
        for(int i=0;i<n;i++)
            wt[i] = sc.nextInt();
        System.out.println("Enter the capacity of the knapsack");
        int w = sc.nextInt();
        System.out.println("The maximum value that can be obtained is "+knapsack(val,wt,w,n));
        
    }
}