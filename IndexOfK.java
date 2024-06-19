import java.util.*;
class IndexOfK{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array ");
        int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to be searched ");
    int k = sc.nextInt();
    int j=n-1;
    for(int i=0;i<=n/2;i++)
    {
        if(arr[i]==k){
            System.out.println("Element found at index "+i);
            break;
        }
        else if(arr[j]==k){
            System.out.println("Element found at index "+j);
            break;
        }
        j--;
    }
}
}