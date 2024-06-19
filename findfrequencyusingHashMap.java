import java.util.HashMap;
import java.util.Scanner;

class findfrequencyusingHashMap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,1,2,3,4,5,6,1,2,3};
        System.out.println("Enetr k value");
        int k=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int oldfreq = map.get(arr[i]);
                int newfreq = oldfreq+1;
                map.put(arr[i],newfreq);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int c=0;
        for(Integer key:map.keySet() )
        {
            if(map.get(key)>=k){
                c++;
            }
        }
        System.out.println("count="+c);
    }
    

}