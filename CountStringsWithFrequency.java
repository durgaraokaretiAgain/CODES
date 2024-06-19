import java.util.*;
class  CountStringsWithFrequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println("Enter freuency: ");
        int fq=sc.nextInt();
        System.out.println("Enter satisfy length: ");
        int l = sc.nextInt();
        System.out.println("String Count:"+getCount(arr,fq,l));
    }
    public static int getCount(String[] arr,int fq,int l){
        int count =0;
        for(String str:arr){
            
            if(str.length()>=l && isValidFrequency(str,fq,l))
                count++;
        }
        return count;
    }
    public static boolean isValidFrequency(String str,int fq,int l){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()>fq)
                return false;
        }
        return true;
    }
} 