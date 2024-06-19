import java.util.Scanner;
class MaxSumInFixSize{
    static int maxSum(int[] arr, int n, int k){
        int max = 0;
        for(int i=0; i<n-k+1; i++){
            int currentMax = 0;
            for(int j=0; j<k; j++){
                currentMax = currentMax+arr[i+j];
            }
            max = Math.max(max, currentMax);
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the subarray: ");
        int k = sc.nextInt();
        System.out.println("The maximum sum of the subarray of size "+k+" is: "+maxSum(arr, n, k));
    }
}