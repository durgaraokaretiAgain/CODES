import java.util.*;
class MaxOccurChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(CheckOccurance(str1,str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean CheckOccurance(String s1,String s2){
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max = 0;
        char ch=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                ch = entry.getKey();
                max = entry.getValue();
            }
        }
        int count=0;
        for(char c2:s2.toCharArray()){
            if(ch ==c2)
                count++;
        }
        return max==count;
    }
}