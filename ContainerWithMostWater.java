import java.util.*;
class ContainerWithMostWater{
    static int FindMaxWater(int[]h,int n){
        int maxArea=0;
        int left=0 , right=n-1;
        while(left<right){
            int d=right-left;
            int min=Math.min(h[left],h[right]);
            int a=min*d;
            maxArea=Math.max(maxArea,a);
            if(h[left]<h[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int h[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            h[i]=sc.nextInt();
        int maxArea=FindMaxWater(h,n);
        System.out.println("Maximum area of water is "+maxArea);
        
    }
}