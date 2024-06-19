import java.util.*;
class DPLcsRecursion{
    static int lcsLength(String x,String y,int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(x.charAt(m-1)==y.charAt(n-1)){
            return 1+lcsLength(x,y,m-1,n-1);
        }
        else{
            return Math.max(lcsLength(x,y,m-1,n),lcsLength(x,y,m,n-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter two strings lengths:");
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println("Enter two strings:");
            String x=sc.next();
            String y=sc.next();
            System.out.println("No of LCS : "+lcsLength(x,y,m,n));
            
    }
}