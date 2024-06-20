import java.util.*;
class FindDuplicatesSW{
    static boolean Find(int[] A,int n,int k){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(i>k)
                hs.remove(A[i-k]);
            System.out.println(hs.size());
            if(hs.contains(A[i]))
                return true;
            hs.add(A[i]);

        }

        return false;
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

        System.out.println("Result :"+Find(A,n,B));
        
    }
}