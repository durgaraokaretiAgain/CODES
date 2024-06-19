import java.util.*;
class kadeneAlg{
    static int maxSubArrSum(int[] A,int n){
        int max=A[0];
        int cmax=A[0];
        for(int i=1;i<n;i++){
            cmax=Math.max(A[i],A[i]+cmax);
            max=Math.max(max,cmax);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(maxSubArrSum(A,n));
        
    }
}