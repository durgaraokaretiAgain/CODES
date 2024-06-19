import java.util.*;
class MakingTwoArraySame{
    static int MinoPerations(int n,int[] arr1,int[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(arr1[i]-arr2[i]);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        System.out.println("Enter the elements of the array1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the array2");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(" minimum operations two Make Changes: " + MinoPerations(n,arr1,arr2));
    }
}