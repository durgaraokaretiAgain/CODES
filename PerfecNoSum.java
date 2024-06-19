import java.util.*;
class PerfecNoSum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum=0;
        for(int i=l;i<=r;i++){
            if(isPerfect(i)){
                sum+=i;
            }
        }
        System.out.println("Sum of all perfect numbers sum is "+sum);

    }
    static boolean isPerfect(int n){
        int sum =1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}