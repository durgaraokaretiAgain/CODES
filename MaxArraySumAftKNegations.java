import java.util.*;
class MaxArraySumAftKNegations{
    static int FindMaSum(int[] arr,int n,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<k;i++){
            int temp=pq.poll();
            temp*=-1;
            pq.add(temp);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=pq.poll();
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max sum is:");
        System.out.println(FindMaSum(arr,n,k));

    }
}