import java.util.*;
class ArrayDiff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array1 size");
        int n = sc.nextInt();
        
        System.out.println("Array1: ");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter array2 size");
        int m = sc.nextInt();
        System.out.println("Array2: ");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        ArrayList<Integer> ar = FindDiff(arr1,arr2);
        System.out.println("Not present in second array:");
        for(Integer i :ar){
            System.out.print(i+" ");
        }
    }
    static ArrayList<Integer> FindDiff(int[] arr1,int[] arr2){
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> Final = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            ar.add(arr2[i]);
        }
        for(Integer i:arr1){
            if(!ar.contains(i))
                Final.add(i);
        }
        return Final;
    }
}