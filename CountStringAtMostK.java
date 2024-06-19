import java.util.*;
class CountStringAtMostK{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0;i<n;i++){
            str[i]=sc.next();

        }
        System.out.println("Enter k Value");
        int k = sc.nextInt();
        int count =0;
        for(String s :str){
            if(isSatisfy(s,k))
                count++;
        }
        System.out.println("Count: "+count);
    }
    static boolean isSatisfy(String str,int k){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch :str.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        for(Character i :hm.keySet()){
            if(hm.get(i)!=k)
                return false;
        }
        return true;
    }
}