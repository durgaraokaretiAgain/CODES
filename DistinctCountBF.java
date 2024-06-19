import java.util.*;
public class DistinctCountBF{

    static ArrayList<Integer> FindDistinct(int[] arr, int n,int B){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n-B+1;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<B;j++){
                hs.add(arr[i+j]);
            }
            ar.add(hs.size());
        }

        return ar;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array elements :");
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i] = sc.nextInt();
        System.out.println("Enter Window size :");
        int B = sc.nextInt();

        ArrayList<Integer> ar =FindDistinct(A,n,B);
        System.out.println("Result :");
        for(Integer i : ar)
            System.out.print(i+" ");
    }
}