import java.util.*;
class ArrayStringIsogramOrNot{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++)
        str[i]=sc.next();
    
    System.out.println(isIsogram(str));
    }
    static String isIsogram(String[] str){
        for(String s:str){
            if(!CheckIsogram(s)){
                return "No";
            }
        }
        return "Yes";
    }
    static boolean CheckIsogram(String S){
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch :S.toCharArray()){
            if(hm.containsKey(ch))
                return false;
            else
                hm.put(ch,1);

        }
        return true;
    }
}