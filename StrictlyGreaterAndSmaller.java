import java.util.*;
class StrictlyGreaterAndSmaller{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array values: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(isStrictly(arr,n));
    }
    static int isStrictly(int[] arr,int n)
    {
        int[] LeftArray = new int[n];
        int[] RightArray = new int[n];
        LeftArray[0] = arr[0];
        for(int i=1;i<n;i++){
            LeftArray[i] = Math.max(LeftArray[i-1],arr[i-1]);

        }
        RightArray[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            RightArray[i]=Math.max(RightArray[i+1],arr[i+1]);
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>LeftArray[i] && arr[i]<RightArray[i])
                return 1;
        }
        return 0;
    }
}