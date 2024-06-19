import java.util.*;
class SqrtOfMatrixDiag{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();

            }
        }
        System.out.println("Diagonal One:");
        for(int i=0;i<n;i++){
            System.out.print(mat[i][i]*mat[i][i]+" ");
        }
        System.out.println();
        System.out.println("Diagonal Two:");
        int N =n-1;
        for(int i=n-1;i>=0;i--){
            System.out.print(mat[N-i][i]*mat[N-i][i]+" ");
        }
    }
}