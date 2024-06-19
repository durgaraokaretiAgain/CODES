import java.util.*;
class ConsecutiveOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Consecutive: "+CheckConsecutive(arr,n));
    }
    static boolean CheckConsecutive(int[] arr,int n){
        int min,max;
        min = arr[0];
        max=arr[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for(Integer i : arr){
            ar.add(i);
        }
        for(int j = min;j<=max;j++){
            if(!ar.contains(j))
                return false;
        }
        return true;

    }
}