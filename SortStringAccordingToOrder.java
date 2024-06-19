import java.util.*;
class SortStringAccordingToOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern string :");
        String pat = sc.next();
        System.out.println("Enter String to be sort :");
        String str = sc.next();
        System.out.println("sorted String"+sortString(pat,str));

    }
    static String sortString(String pat,String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();

        for(char c:pat.toCharArray()){
            if(hm.containsKey(c))

                sb.append(String.valueOf(c).repeat(hm.get(c)));
        }
        return sb.toString();
    }
}