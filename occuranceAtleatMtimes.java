import java.util.*;
class occureAtleastMtimes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println("Result: ");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=m)
                System.out.println(entry.getKey()+" ");
        }
        sc.close();
    }
}