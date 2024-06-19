import java.util.*;
class ConsecutiveZeroesInBString{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        System.out.println("Enter K value");
        int k = sc.nextInt();
        System.out.println("Consecutive Zeroes: "+FindZeroes(str,k));
    }
    public static int FindZeroes(String str,int k){
        String Constr = str.repeat(k);
        int maxCount=0;
        int count=0;
        for(char ch:Constr.toCharArray())
        {
            if(ch=='0')
                count++;
            else
                count=0;
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}