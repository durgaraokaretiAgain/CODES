import java.util.*;
class JumpGame{
    static boolean canJump(int[] nums,int n){
        int lastPos = n-1;
        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=lastPos){
                lastPos = i;
            }
        }
        return lastPos==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Can you reach the last index?");
        System.out.println(canJump(arr,n));
    }
}