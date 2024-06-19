import java.util.*;
class DistinctCountSW{
    static ArrayList<Integer> FindCount(int[] A,int n,int B){
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<B;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        ar.add(hm.size());
        for(int i=B;i<n;i++){
            if(hm.get(A[i-B])!=null){
                if(hm.get(A[i-B])>1)
                    hm.put(A[i-B],hm.get(A[i-B])-1);
                else 
                    hm.remove(A[i-B]);
            }

            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            ar.add(hm.size());

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

        ArrayList<Integer> ar =FindCount(A,n,B);
        System.out.println("Result :");
        for(Integer i : ar)
            System.out.print(i+" ");
    }
}