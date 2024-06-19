import java.util.*;
class MatrixEleMinRMaxC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Result:");
        FindEle(mat,m,n);


    }
    static void FindEle(int[][] mat,int m,int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int mincol=-1;
            for(int j=0;j<n;j++)
            {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                    mincol= j;
                }
            }
            for(int k=0;k<m;k++){
                if (mat[k][mincol] > max) {
                    max = mat[k][mincol];
                }
            }
            if(max==min)
                System.out.println(max);
        }
        
    }
}