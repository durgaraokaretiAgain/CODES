import java.util.*;
class MinimizeNto1{
    static int MinOp(int n){
        int[] dp = new int[n+1];

        if(n==0 || n==1){
            return 0;
        }   
        if(n==2 || n==3){
            return 1;
        }
        for(int i=4;i<=n;i++){
            int a1 = Integer.MAX_VALUE;
            int a2 = Integer.MAX_VALUE;
            int a3 = Integer.MAX_VALUE;
            if(i%2==0)
                a1 = 1+MinOp(i/2);
            if(i%3==0)
                a2 = 1+MinOp(i/3);
            a3 = 1+MinOp(i-1);
            dp[i] = Math.min(a1,Math.min(a2,a3));
        }
        return dp[n];

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(MinOp(n));
        
    }
}