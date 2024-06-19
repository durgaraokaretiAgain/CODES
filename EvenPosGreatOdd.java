import java.util.*;
class EvenPosGreatOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int temp=0;
        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
            }
            else if(i%2!=0 && arr[i]<arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("results:");
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}