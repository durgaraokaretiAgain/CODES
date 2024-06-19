import java.util.*;
class DpNthStair{
    static int countWays(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 4;
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of ways to reach the "+n+"th stair is "+countWays(n));
    }
}