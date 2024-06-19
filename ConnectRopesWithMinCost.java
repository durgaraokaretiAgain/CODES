import java.util.*;
class ConnectRopesWithMinCost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Cost: "+minCost(arr));
    }
    public static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            cost += first+second;
            pq.add(first+second);
        }
        return cost;
    }
}