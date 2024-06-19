import java.util.*;
class KthOccurence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(Integer i: arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println("Enter k Value");
        int k=sc.nextInt();
        ArrayList< Map.Entry<Integer,Integer>> freqlist= new ArrayList<>(hm.entrySet());
        freqlist.sort((i1,i2) ->i2.getValue().compareTo(i1.getValue()));
        int freqval = freqlist.get(k).getValue();
        for(Map.Entry<Integer,Integer> entry: freqlist){
            if(entry.getValue()==freqval)
                System.out.println(k + " Most occurance Elements in Array are : "+entry.getKey());
        }
    }
}