import java.util.*;
class MinnumbOfPlatForms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of trains");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];
        System.out.println("Enter the arrival time of trains");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the departure time of trains");
        for(int i = 0; i < n; i++)
            dep[i] = sc.nextInt();

        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
    }

    static int findPlatform(int[] arr, int[] dep, int n){
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                plat_needed++;
                i++;
            }
            else if(arr[i] > dep[j]){
                plat_needed--;
                j++;
            }
            if(plat_needed > result)
                result = plat_needed;
        }
        return result;
    }
}