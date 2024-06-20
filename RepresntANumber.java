import java.util.*;
class RepresntANumber{
    static int FindWays(int n){

        int[] dp = new int[n+1];

        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;

        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-3]+dp[i-4];
        }

        return dp[n];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int res = FindWays(n);
        System.out.println("Ways to Represent a Value "+n+" is "+res);
    }
}