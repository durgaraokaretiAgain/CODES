import java.util.*;
class LongestCommonSubSequence{
    static void lcs(String x,String y,int m,int n){
        int dp[][] = new int[m+1][n+1];
        dp[0][0]=0;
        int diag=0,top=0,left=0;
        for(int i=1;i<=m;i++){
            dp[i][0]=0;
            for(int j=1;j<=n;j++){
                dp[0][j]=0;
                diag=dp[i-1][j-1];
                top=dp[i-1][j];
                left=dp[i][j-1];
                if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j]=diag+1;
                else
                    dp[i][j]=Math.max(top,left);
            }
        }
        int i=m,j=n;
        String str="";
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                str=x.charAt(i-1)+str;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else
                j--;  
        }

        System.out.println(dp[m][n]);
        System.out.println("LCS : "+str);

    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two strings lengths:");
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println("Enter two strings:");
            String x=sc.next();
            String y=sc.next();
            System.out.println("No of LCS : ");
            lcs(x,y,m,n);
            

        }
    }