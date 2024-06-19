import java.util.*;
import java.util.Collections.*;
class MaxSumOfTwoArrays{
    static int FindSum(int[] A,int[] B,int n){
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i]*B[n-1-i];
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("Array1 Values:");
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
        System.out.println("Array2 values:");
        for(int i=0;i<n;i++)
            B[i]=sc.nextInt();
        System.out.println("Max Sum :"+FindSum(A,B,n));
    }
}