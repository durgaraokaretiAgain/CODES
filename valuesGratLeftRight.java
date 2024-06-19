import java.util.*;
class valuesGratLeftRight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        findValue(a,n);
    }
    static void findValue(int[] a,int n)
    {
        int left = 0,right=0;
        if(a[0]>a[1])
            System.out.print(0+" ");
        for(int i=1;i<n-1;i++){
            left = a[i-1];
            right = a[i+1];
            if(a[i]>left && a[i]>right)
                System.out.print(i+" "); 
        }
        if(a[n-1]>a[n-2])
            System.out.print(n-1+" ");
    }
}