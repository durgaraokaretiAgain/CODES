import java.util.*;
class MaxTaskInGivenTime{
    static int MaxTask(int n,int[] arr,int t){
        Arrays.sort(arr);
        int sum=0,i=0;
        while(sum<=t){
            sum+=arr[i];
            i++;
        }
        
        return i-1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("No Of Tasks: "+MaxTask(n,arr,t));
    }
}