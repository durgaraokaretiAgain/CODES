import java.util.*;
class StringDNotContChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println("Enter string:");
        String str = sc.next();
        System.out.println("Count: "+FindCount(arr,str,n));

    }
    static int FindCount(String[] arr,String str,int n){
        int count=0;
        for(String s:arr){
            if(!isContain(s,str))
                count++;
        }
        return count;
    }
    static boolean isContain(String s,String str){
        for(Character ch:str.toCharArray()){
            if(s.contains(ch.toString()))
                return true;
        }
        return false;
    }
}