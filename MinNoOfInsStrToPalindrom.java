import java.util.*;
class MinNoOfInsStrToPalindrom{
    static int FindMin(char[] str,int l,int h){
        if(l>h)
            return Integer.MAX_VALUE;
        
        if(l==h)
            return 0;
        if(l==h-1){
            if(str[l]==str[h])
                return 0;
            else    
                return 1;
        }

        if(str[l]==str[h])
            return FindMin(str,l+1,h-1);
        else
            return Math.min(FindMin(str,l+1,h),FindMin(str,l,h-1))+1;
            
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.next();

        int res = FindMin(str.toCharArray(),0,str.length()-1);

        System.out.println("Min number of characters are :"+res);
    }
}