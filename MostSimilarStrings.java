import java.util.*;
class MostSimilarStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();

        }
        System.out.println("Enter  matching string:");
        String s = sc.next();
        System.out.println(GetString(str,s));
    }
    static String GetString(String[] str,String s){
        int max = Integer.MIN_VALUE;
        String str2="";
        for(String str1:str){
            int count = getCount(str1,s);

            if(count>max){
                max=count;
                str2=str1;
            }
        }
        return str2;
    }
    static int getCount(String str1,String s){
        int StringCount=0;
        for(char ch : s.toCharArray()){
            if(str1.contains(String.valueOf(ch)))
                StringCount++;
        }
        return StringCount;
    }
}