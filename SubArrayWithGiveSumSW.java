import java.util.*;
class SubArrayWithGiveSumSW{
    static int[] FindSubArray(int[] A,int n,int s){
        int sum =0,l=0,r=0;
        while(r<n){
            sum+=A[r];
            while(sum>s){
                sum-=A[l];
                l++;
            }
            if(sum==s)
                return new int[]{l,r};
            r++;
        }

        return null;
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
        int[] res = FindSubArray(A,n,s);
        if(res==null)
            System.out.println("SubArray Not Found :");
        else
            System.out.println("Subarray fund bw "+res[0] +" to "+ res[1]);
    }
}