import java.util.*;
class FindMaxValue{
    static int MaxValue(int[] A,int n){
        Arrays.sort(A);
        int prod=0;
        
        for(int i=0;i<n;i++){
            prod+=A[i]*i;
        }
        return prod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("The maximum value of the product is");
        System.out.println(MaxValue(A,n));
    }
}