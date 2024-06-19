import java.util.Scanner;
class DPTabNthStaitWithMsteps{
    static void countWays(int n,int m){
        
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=0;
            for(int j=1;j<=m && j<=i;j++){
                dp[i]+=dp[i-j];
            }
        }
        System.out.println(dp[n]);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        countWays(n,m);
    }
}