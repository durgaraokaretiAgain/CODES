import java.util.*;
class ElementsWithCountK{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value");
        int k = sc.nextInt();

        System.out.println("Count: "+CountEle(arr,k));
    }
    static int CountEle(int[] arr,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer i :arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int count =0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()==k && !hm.containsKey(2*entry.getKey()))
                count++;
        }
        return count;
    }
}