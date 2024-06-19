import java.util.*;
class ConcatenateUncommonChars{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings:");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Concatenated string:"+FindString(s1,s2));

    }
    static String FindString(String s1,String s2){
        Set<Character> S = new LinkedHashSet();
        for(char ch :s1.toCharArray()){
            S.add(ch);

        }
        for(char ch :s2.toCharArray()){
            S.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : S){
            if(!s1.contains(ch.toString()) || !s2.contains(ch.toString()))
                sb.append(ch);
        }
        return sb.toString();
    }
}