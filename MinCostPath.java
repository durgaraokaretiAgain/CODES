import java.util.*;
class MinCostPath{
    static void Cost(int[][] c,int m,int n){
        int dp[][]=new int[m][n];
        dp[0][0]=c[0][0];
        for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+c[i][0];
            for(int j=1;j<n;j++){
                dp[0][j]=dp[0][j-1]+c[0][j];
                dp[i][j]=c[i][j]+Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int c[][] = new int[m][n];
        System.out.println("Enter the cost matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=sc.nextInt();
            }
        }
        System.out.println("The minimum cost to reach the destination is");
        Cost(c,m,n);
    }
}