import java.util.*;
class SubArrayWithMilLenSW{
    static int FindSubArray(int[] A,int n,int s){
        int sum =0,l=0,r=0;
        int min_len = n+1;
        while(r<n){
            sum+=A[r];
            while(sum>s){
                min_len = Math.min(min_len,r-l+1);
                sum-=A[l];
                l++;
            }
            r++;
        }
        if(min_len==n+1)
            return -1;
        return min_len;
      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i] = sc.nextInt();
        System.out.println("Enter Sum :");
        int s = sc.nextInt();
        int res = FindSubArray(A,n,s);
        if(res==-1)
            System.out.println("SubArray Not Found :");
        else
            System.out.println("Subarray Min lenth is :"+res);
    }
}