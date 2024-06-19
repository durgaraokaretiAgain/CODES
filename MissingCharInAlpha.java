import java.util.*;
class MissingCharInAlpha{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Missing Elements are:"+missingChar(str));
    }
    static String missingChar(String s){
        String str = s.toLowerCase();
        boolean[] mstr = new boolean[26];
        Arrays.fill(mstr,false);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                mstr[ch-'a']=true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(!mstr[i])
                sb.append((char)('a'+i));

        }
        return sb.toString();
    }
}