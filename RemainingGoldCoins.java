import java.util.*;
class RemainingGoldCoins{
    static int GoldCoins(int[] c,int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(c[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int t1=pq.poll();
            int t2=pq.poll();
            if(t1!=t2){
                pq.add(Math.abs(t1-t2));
            }

        }
        if(pq.size()==0){
            return 0;
        }
        return pq.poll();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        System.out.println("Remaining Gold Coins: ");
        System.out.println(GoldCoins(c,n));

    }
}