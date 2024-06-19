import java.util.*;
class ExpandString{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        FinalString(str);
    }
    static void FinalString(String str){
        String[] s = str.split("[()]");
        StringBuilder sb = new StringBuilder();
        for(int i =1;i<s.length;i+=2)
        {
            int n = Integer.parseInt(s[i-1]);
            
            sb.append(s[i].repeat(n));

        }
        System.out.println(sb.toString());
    }
}