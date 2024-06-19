import java.util.*;
class MinPath{
    static int findPath(int m,int n){
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=1;i<m;i++){
            dp[i][0]=1;
            for(int j=1;j<n;j++){
                dp[0][j]=1;
                dp[i][j]=dp[i][j-1]+dp[i-1][j]+dp[i-1][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("All possible paths to top-left to bottom-right: "+findPath(m,n));
    }
}