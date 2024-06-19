import java.util.*;
class ProductOfArrayExceptItself{
    static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i] = left[i]*right[i];
        }

        return result;
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result[] = productExceptSelf(nums);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        
    }
}