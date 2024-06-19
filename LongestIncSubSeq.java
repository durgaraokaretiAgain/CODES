import java.util.*;
class LongestIncSubSeq{
    static int LIS(int arr[],int n){
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && dp[i]<dp[j]+1)
                    dp[i] = dp[j]+1;
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(LIS(arr,n));
        
    }
}