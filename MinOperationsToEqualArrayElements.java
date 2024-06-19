import java.util.*;
class MinOperationsToEqualArrayElements {
    static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int ans = 0;
        for (int num : nums) {
            ans += Math.abs(num - median);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Min Operations: " + minMoves2(nums));
    }
}