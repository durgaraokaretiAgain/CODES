import java.util.*;
class CountSmallEleOnRight {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] countSmall = new int[n];

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i])
                    count++;
            }
            countSmall[i]=count;
        }
        System.out.println("result:");
        for(Integer i : countSmall)
            System.out.println(i);
    }
}