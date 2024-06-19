import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findLeaders(arr);
    }

    static void findLeaders(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];

        System.out.print("Leaders in array are: " + max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(" " + max);
            }
        }

        System.out.println();
    }
}
