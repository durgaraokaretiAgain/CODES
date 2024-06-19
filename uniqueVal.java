import java.util.*;
class uniqueVal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter Array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        System.out.println("Unique elements are: ");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(+entry.getKey());
                count++;
            }
        }
        System.out.println("Number of unique elements are: "+count);

    }
}