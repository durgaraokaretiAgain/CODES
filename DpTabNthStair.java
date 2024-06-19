import java.util.*;
class DpTabNthStair{
    static void countWays(int n){
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of ways to reach "+n+"th stair is:");
        countWays(n);
    }
}