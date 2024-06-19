import java.util.*;
class CircularlyShiftChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Shifted String:"+ShiftString(str));
    }
    static String ShiftString(String str){
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char s:str.toCharArray()){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        StringBuilder result = new StringBuilder();
        for (char s : str.toCharArray()) {
            char ch1 = s;
            char ch2 = (char) (ch1 + hm.get(ch1));

            result.append(ch2);
        }
        return result.toString();
    }
}