import java.util.*;
class OddCubEvenSqr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int[] array = ChangeArray(arr,n);
        System.out.println("Result:");
        for(Integer i :array)
            System.out.println(i);
    }
    static int[] ChangeArray(int[] arr,int n){
        for(int i =0;i<n;i++){
            if(i%2==0)
                arr[i]=(int) Math.pow(arr[i],3);
            else
                arr[i]=(int)Math.pow(arr[i],2);
        }
        return arr;
    }
}