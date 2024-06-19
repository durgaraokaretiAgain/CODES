import java.util.*;
class FindSumAdjSW{
    static int FindSum(int[] A,int n,int k){

        int max_sum = 0;
        for(int i=0;i<k;i++){
            max_sum += A[i];
        }
        int window_sum = max_sum;
        for(int i=k;i<n+k-1;i++){
            // if(i<n){
            window_sum += A[i%n] - A[i-k];
            max_sum = Math.max(max_sum,window_sum);
            // }
            // else{
            //     window_sum += A[i-n] - A[i-k];
            //     max_sum = Math.max(max_sum,window_sum);
            // }
        }
        return max_sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements");
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the Window Size");
        int k = sc.nextInt();
        System.out.println("Max Sum "+FindSum(A,n,k));
    }
}