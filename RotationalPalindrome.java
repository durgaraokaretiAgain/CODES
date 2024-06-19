import java.util.*;
class RotationalPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CheckRpalindrome(str));
    }
    static int CheckRpalindrome(String str){
        if(isPalindrome(str))
            return 1;
        for(int i=1;i<str.length();i++){
            String s = str.substring(i)+str.substring(0,i);
            if(isPalindrome(s))
                return 1;
        }
        return 0;
    }
    static boolean isPalindrome(String S){
        int l=0,r=S.length()-1;
        while(l<r){
            if(S.charAt(l)!=S.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}