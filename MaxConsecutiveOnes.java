import java.util.*;
class MaxConsecutiveOnes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Result: "+findMaxConsecutiveOnes(nums));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
            i++;
        }
        return Math.max(max, count);
    }
}