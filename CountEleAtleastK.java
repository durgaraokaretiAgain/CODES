import java.util.*;
class CountEleAtleastK{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k value:");
        int k = sc.nextInt();
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println("Result: ");
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>k)
                count++;
        }
        System.out.println(count);
        
    }
}