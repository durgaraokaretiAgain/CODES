import java.util.*;
class HighestProduct{
    static int FindProduct(int n,int[] arr){
        Arrays.sort(arr);
        int prod1=arr[0]*arr[1]*arr[n-1];
        int prod2 = arr[n-1]*arr[n-2]*arr[n-3];
        return prod1 > prod2 ? prod1 : prod2;
        
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = sc.nextInt();
        }
        System.out.println("Max product: "+FindProduct(n,arr));
    }
}