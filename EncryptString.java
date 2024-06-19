import java.util.*;
class EncryptString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            sb.append(String.valueOf(c).repeat(i+1));
        }
        System.out.println(sb.toString());
    }
}