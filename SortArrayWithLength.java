import java.util.*;
class SortArrayWithLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String str[] = new String[l];
        System.out.println("Enter Array of Strings:");
        for(int i=0;i<l;i++){
            str[i]=sc.next();
        }
        System.out.println("Sorted Array:");
        SortArray(str);
    }
    static void SortArray(String[] str)
    {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s : str){
            hm.put(s,s.length());
        }

        TreeMap<String,Integer> SortedArray = new TreeMap<>((Comparator<String>)(s1,s2) -> hm.get(s1).compareTo(hm.get(s2)));
        SortedArray.putAll(hm);
        for(Map.Entry<String,Integer> entry : SortedArray.entrySet())
        {
            System.out.println(entry.getKey());
        }
    }
}