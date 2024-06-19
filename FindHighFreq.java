import java.util.*;
class FindHighFreq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>n/2)
                System.out.println(entry.getKey());
        }
    }
}