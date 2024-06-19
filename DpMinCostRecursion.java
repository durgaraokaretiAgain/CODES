import java.util.*;
class DpMinCostRecursion{
    static int Cost(int[][] c,int m,int n){
        if(m==0 && n==0)
            return c[m][n];
        if(m==0)
            return c[m][n]+Cost(c,m,n-1);
        if(n==0)
            return c[m][n]+Cost(c,m-1,n);
        return c[m][n]+Math.min(Cost(c,m-1,n),Math.min(Cost(c,m,n-1),Cost(c,m-1,n-1)));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns"); 
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] c=new int[m][n];
        System.out.println("Enter the cost matrix");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                c[i][j]=sc.nextInt();
        System.out.println("Minimum cost to reach the end of the matrix is "+Cost(c,m-1,n-1));
        
    }
}