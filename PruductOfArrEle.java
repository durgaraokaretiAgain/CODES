import java.util.Scanner;
class PruductOfArrEle{   
    
    public static int[] FindProduct(int[] arr,int n){
        int[] res = new int[n];
        int temp = 1;
        for(int i=0;i<n;i++){
            res[i] = temp;
            temp *= arr[i];
        }
        temp = 1;
        for(int i=n-1;i>=0;i--){
            res[i] *= temp;
            temp *= arr[i];
            
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = FindProduct(arr,n);
        System.out.println("The product of all elements except the current element is:");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        
    }
}